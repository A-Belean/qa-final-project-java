package com.abelean.homework;

public class TestConfigRunner {
    public static void main(String[] args) {
        BrowserConfig cfg_1 = new BrowserConfig(BrowserType.EDGE, "1.0.0", true);
        BrowserConfig cfg_2 = new BrowserConfig(BrowserType.FIREFOX,"1.5.0");
        BrowserConfig cfg_3 = new BrowserConfig(BrowserType.CHROME);

        BrowserConfig default_cfg = BrowserConfig.createDefaultChromeConfig();

        cfg_1.afiseazaConfig();
        cfg_2.afiseazaConfig();
        cfg_3.afiseazaConfig();
        default_cfg.afiseazaConfig();
    }
}
