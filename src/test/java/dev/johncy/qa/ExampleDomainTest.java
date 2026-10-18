package dev.johncy.qa;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExampleDomainTest {

    @Test
    void exampleDomainDisplaysExpectedHeading() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(true)
            );
            try {
                Page page = browser.newPage();
                page.navigate("https://example.com/");
                assertEquals("Example Domain", page.title());
                assertEquals("Example Domain", page.locator("h1").innerText());
                assertTrue(page.locator("a").first().getAttribute("href").contains("iana.org"));
            } finally {
                browser.close();
            }
        }
    }
}
