package burp;

public class BurpExtender implements IBurpExtender
{

    @Override
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks)
    {
        IExtensionHelpers helpers = callbacks.getHelpers();

        callbacks.setExtensionName("Random User-Agent");

        callbacks.registerContextMenuFactory(new Menu(helpers));

    }
}
