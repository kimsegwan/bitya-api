package org.bitya.sample;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class SampleController {

    @Operation(summary = "샘플 제작", description = "샘플 제작됩니다.", tags = { "sample-api-controller" })
    @Parameter(name = "id", description = "반환값", example = "0", required = true)
    @GetMapping("/api/sample/{id}")
    public String selectSample(@PathVariable String id) {
        return "success:: " + id;
    }
}
