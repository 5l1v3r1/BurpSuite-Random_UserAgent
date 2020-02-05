// BurpSuite Random User-Agent Generator 
// Coded by M'hamed (@m4ll0k) Outaadi 
// =====================================
package burp;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URLDecoder;
import java.util.*;

public class Utilities {

    public static byte[] GenerateAgent(IExtensionHelpers helpers, IHttpRequestResponse requestResponse) throws Exception {

        byte[] request = requestResponse.getRequest();

        IRequestInfo requestInfo = helpers.analyzeRequest(request);

        int bodyOffset = requestInfo.getBodyOffset();

        byte content_type = requestInfo.getContentType();

        String ldt = "";

        String useragent = "User-Agent: ";

        String body = new String(request, bodyOffset, request.length - bodyOffset, "UTF-8");

        List<String> headers;
        headers = helpers.analyzeRequest(request).getHeaders();
        Iterator<String> iter = headers.iterator();
        while(iter.hasNext()){
            if(iter.next().contains("User-Agent"))
                iter.remove();
        }
        useragent = useragent.concat(RandomAgent());
        headers.add(useragent);
        return helpers.buildHttpMessage(headers,ldt.getBytes());

        }
    public static String RandomAgent(){
        Random rand = new Random();
        List<String> agents = new ArrayList<>();
        agents.add("Mozilla/5.0 (Linux) Gecko Iceweasel (Debian) Mnenhy");
        agents.add("Mozilla/5.0 (Linux i686; U; en; rv:1.8.1) Gecko/20061208 Firefox/2.0.0");
        agents.add("Mozilla/5.0 (Amiga; U; AmigaOS 1.3; en; rv:1.8.1.19) Gecko/20081204 SeaMonkey/1.1.14");
        agents.add("Mozilla/5.0 (AmigaOS; U; AmigaOS 1.3; en-US; rv:1.8.1.21) Gecko/20090303 SeaMonkey/1.1.15");
        agents.add("Mozilla/5.0 (AmigaOS; U; AmigaOS 1.3; en; rv:1.8.1.19) Gecko/20081204 SeaMonkey/1.1.14");
        agents.add("Mozilla/5.0 (BeOS; U; BeOS BeBox; fr; rv:1.9) Gecko/2008052906 BonEcho/2.0");
        agents.add("Mozilla/5.0 (BeOS; U; BeOS BePC; en-US; rv:1.8.1.1) Gecko/20061220 BonEcho/2.0.0.1");
        agents.add("Mozilla/5.0 (BeOS; U; Haiku BePC; en-US; rv:1.8.1.10pre) Gecko/20080112 SeaMonkey/1.1.7pre");
        agents.add("Mozilla/5.0 (Linux 2.4.18-18.7.x i686; U) Opera 6.03 [en]");
        agents.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36");
        agents.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36");
        agents.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
        agents.add("Mozilla/5.0 (Windows; U; MSIE 7.0; Windows NT 6.0; en-US)");
        agents.add("Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.0; Trident/5.0;  Trident/5.0)");
        agents.add("Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; Trident/6.0; MDDCJS)");
        agents.add("Mozilla/5.0 (compatible, MSIE 11, Windows NT 6.3; Trident/7.0; rv:11.0) like Gecko");
        agents.add("Mozilla/5.0 (iPad; CPU OS 8_4_1 like Mac OS X) AppleWebKit/600.1.4 (KHTML, like Gecko) Version/8.0 Mobile/12H321 Safari/600.1.4");
        agents.add("Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)");
        agents.add("Mozilla/5.0 (compatible; bingbot/2.0; +http://www.bing.com/bingbot.htm)");
        agents.add("Mozilla/5.0 (Linux; Android 6.0.1; SAMSUNG SM-G570Y Build/MMB29K) AppleWebKit/537.36 (KHTML, like Gecko) SamsungBrowser/4.0 Chrome/44.0.2403.133 Mobile Safari/537.36");
        agents.add("Mozilla/5.0 (Linux; Android 5.0; SAMSUNG SM-N900 Build/LRX21V) AppleWebKit/537.36 (KHTML, like Gecko) SamsungBrowser/2.1 Chrome/34.0.1847.76 Mobile Safari/537.36");
        agents.add("curl/7.35.0");
        agents.add("Lynx/2.8.8pre.4 libwww-FM/2.14 SSL-MM/1.4.1 GNUTLS/2.12.23");
        agents.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.79 Safari/537.36");
        agents.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:71.0) Gecko/20100101 Firefox/71.0");
        agents.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1.2 Safari/605.1.15");
        agents.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_5) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1.1 Safari/605.1.15");
        agents.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Safari/605.1.15");
        agents.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36");
        agents.add("Opera/9.80 (X11; Linux x86_64; U; it) Presto/2.2.15 Version/10.10");
        agents.add("Opera/9.80 (X11; Linux i686; U; pl) Presto/2.2.15 Version/10.00");
        agents.add("Opera/9.80 (Windows NT 5.1; U; cs) Presto/2.2.15 Version/10.10");
        agents.add("Opera/9.80 (Windows 98; U; de) Presto/2.6.30 Version/10.61");
        agents.add("Opera/9.80 (Linux i686; U; en) Presto/2.5.22 Version/10.51");
        agents.add("Opera/9.64 (X11; Linux x86_64; U; en) Presto/2.1.1");
        agents.add("Opera/7.01 (Windows NT 5.0; U) [en]");
        agents.add("Mozilla/6.0 (X11; U; Linux x86_64; en-US; rv:2.9.0.3) Gecko/2009022510 FreeBSD/ Sunrise/4.0.1/like Safari");
        agents.add("Mozilla/6.0 (Windows; U; Windows NT 6.0; en-US; rv:1.9.0.8) Gecko/2009032609 Firefox/3.0.8");
        agents.add("Mozilla/5.001 (Macintosh; N; PPC; ja) Gecko/25250101");
        agents.add("Mozilla/5.0(X11;U;Linux(x86_64);en;rv:1.9a8)Gecko/2007100619;GranParadiso/3.1");
        agents.add("Mozilla/5.0(Compatible; Windows; U; en-US;) Sundance/0.9");
        agents.add("Mozilla/5.0 Galeon/1.2.9 (X11; Linux i686; U;) Gecko/20021213 Debian/1.2.9-0.bunk");
        agents.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3831.6 Safari/537.36");
        agents.add("Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US) AppleWebKit/533.20.25 (KHTML, like Gecko) Version/5.0.4 Safari/533.20.27");
        agents.add("Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; Touch; rv:11.0) like Gecko");
        agents.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; Trident/7.0; rv:11.0) like Gecko");
        agents.add("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.94 Safari/537.36 Vivaldi/2.6.1566.40");
        agents.add("Mozilla/4.0 (compatible; MSIE 6.0; Linux 2.6.26-1-amd64) Lobo/0.98.3");
        return agents.get(rand.nextInt(agents.size()));
    }
    }
