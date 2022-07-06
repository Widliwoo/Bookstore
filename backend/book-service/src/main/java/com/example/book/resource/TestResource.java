package com.example.book.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestResource {

    @GetMapping(produces = MediaType.TEXT_HTML_VALUE)
    public String test() {
        return """
    <h1>Test Data Sample</h1>
    <table>
        <tr>
            <td>col1</td>
            <td>col2</td>
            <td>col3</td>
            <td>col4</td>
        </tr>
        <tr>
            <td>col1</td>
            <td>col2</td>
            <td>col3</td>
            <td>col4</td>
        </tr>
        <tr>
            <td>col1</td>
            <td>col2</td>
            <td>col3</td>
            <td>col4</td>
        </tr>
    </table>
    """;
    }
}
