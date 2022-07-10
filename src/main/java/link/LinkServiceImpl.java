package link;

import com.example.linkshortener.LinkDto;

import java.util.HashMap;
import java.util.Map;

public class LinkServiceImpl implements LinkService{

  final Map <String,LinkDto> repository = new HashMap<>();


    @Override
    public LinkDto createLink(LinkDto linkDto) {
        repository.put(linkDto.getId(),linkDto);
        return linkDto;
    }

    @Override
    public String getLink(LinkDto linkDto) {
        return repository.get(linkDto.getId()).getTargetUrl();


    }
}


