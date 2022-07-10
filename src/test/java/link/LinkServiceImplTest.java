package link;

import com.example.linkshortener.LinkDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkServiceImplTest {

    @Test
    void shouldNotCreateShortenedLinkInCaseOfOccupiedIdentifier() {
        //Given
        LinkService linkService = new LinkServiceImpl();
        LinkDto linkDto = linkService.createLink(new LinkDto("some ID", "test@email.com", "https://google.com", null, 0));
        linkService.createLink(linkDto);

        //When
        linkService.createLink(new LinkDto("some ID","email@test.pl", "https://bing.com", null, 1));

        //Then

    }
}
