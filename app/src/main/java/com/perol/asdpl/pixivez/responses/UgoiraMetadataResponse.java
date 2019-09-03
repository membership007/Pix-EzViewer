package com.perol.asdpl.pixivez.responses;

import java.util.List;

/**
 * Created by Notsfsssf on 2018/3/26.
 */

public class UgoiraMetadataResponse {

    /**
     * ugoira_metadata : {"zip_urls":{"medium":"https://i.pximg.net/img-zip-ugoira/img/2014/11/04/02/25/15/46907945_ugoira600x600.zip"},"frames":[{"file":"000000.jpg","delay":50},{"file":"000001.jpg","delay":50},{"file":"000002.jpg","delay":50},{"file":"000003.jpg","delay":50},{"file":"000004.jpg","delay":50},{"file":"000005.jpg","delay":50},{"file":"000006.jpg","delay":50},{"file":"000007.jpg","delay":50},{"file":"000008.jpg","delay":50},{"file":"000009.jpg","delay":50},{"file":"000010.jpg","delay":50},{"file":"000011.jpg","delay":50},{"file":"000012.jpg","delay":50},{"file":"000013.jpg","delay":50},{"file":"000014.jpg","delay":50},{"file":"000015.jpg","delay":50},{"file":"000016.jpg","delay":50},{"file":"000017.jpg","delay":50},{"file":"000018.jpg","delay":50},{"file":"000019.jpg","delay":50},{"file":"000020.jpg","delay":50},{"file":"000021.jpg","delay":50},{"file":"000022.jpg","delay":50},{"file":"000023.jpg","delay":50},{"file":"000024.jpg","delay":50},{"file":"000025.jpg","delay":50},{"file":"000026.jpg","delay":50},{"file":"000027.jpg","delay":50},{"file":"000028.jpg","delay":50},{"file":"000029.jpg","delay":50},{"file":"000030.jpg","delay":50},{"file":"000031.jpg","delay":50},{"file":"000032.jpg","delay":50},{"file":"000033.jpg","delay":50},{"file":"000034.jpg","delay":50},{"file":"000035.jpg","delay":50},{"file":"000036.jpg","delay":50},{"file":"000037.jpg","delay":50},{"file":"000038.jpg","delay":50},{"file":"000039.jpg","delay":50},{"file":"000040.jpg","delay":50},{"file":"000041.jpg","delay":50},{"file":"000042.jpg","delay":50},{"file":"000043.jpg","delay":50},{"file":"000044.jpg","delay":50},{"file":"000045.jpg","delay":50}]}
     */

    private UgoiraMetadataBean ugoira_metadata;

    public UgoiraMetadataBean getUgoira_metadata() {
        return ugoira_metadata;
    }

    public void setUgoira_metadata(UgoiraMetadataBean ugoira_metadata) {
        this.ugoira_metadata = ugoira_metadata;
    }

    public static class UgoiraMetadataBean {
        /**
         * zip_urls : {"medium":"https://i.pximg.net/img-zip-ugoira/img/2014/11/04/02/25/15/46907945_ugoira600x600.zip"}
         * frames : [{"file":"000000.jpg","delay":50},{"file":"000001.jpg","delay":50},{"file":"000002.jpg","delay":50},{"file":"000003.jpg","delay":50},{"file":"000004.jpg","delay":50},{"file":"000005.jpg","delay":50},{"file":"000006.jpg","delay":50},{"file":"000007.jpg","delay":50},{"file":"000008.jpg","delay":50},{"file":"000009.jpg","delay":50},{"file":"000010.jpg","delay":50},{"file":"000011.jpg","delay":50},{"file":"000012.jpg","delay":50},{"file":"000013.jpg","delay":50},{"file":"000014.jpg","delay":50},{"file":"000015.jpg","delay":50},{"file":"000016.jpg","delay":50},{"file":"000017.jpg","delay":50},{"file":"000018.jpg","delay":50},{"file":"000019.jpg","delay":50},{"file":"000020.jpg","delay":50},{"file":"000021.jpg","delay":50},{"file":"000022.jpg","delay":50},{"file":"000023.jpg","delay":50},{"file":"000024.jpg","delay":50},{"file":"000025.jpg","delay":50},{"file":"000026.jpg","delay":50},{"file":"000027.jpg","delay":50},{"file":"000028.jpg","delay":50},{"file":"000029.jpg","delay":50},{"file":"000030.jpg","delay":50},{"file":"000031.jpg","delay":50},{"file":"000032.jpg","delay":50},{"file":"000033.jpg","delay":50},{"file":"000034.jpg","delay":50},{"file":"000035.jpg","delay":50},{"file":"000036.jpg","delay":50},{"file":"000037.jpg","delay":50},{"file":"000038.jpg","delay":50},{"file":"000039.jpg","delay":50},{"file":"000040.jpg","delay":50},{"file":"000041.jpg","delay":50},{"file":"000042.jpg","delay":50},{"file":"000043.jpg","delay":50},{"file":"000044.jpg","delay":50},{"file":"000045.jpg","delay":50}]
         */

        private ZipUrlsBean zip_urls;
        private List<FramesBean> frames;

        public ZipUrlsBean getZip_urls() {
            return zip_urls;
        }

        public void setZip_urls(ZipUrlsBean zip_urls) {
            this.zip_urls = zip_urls;
        }

        public List<FramesBean> getFrames() {
            return frames;
        }

        public void setFrames(List<FramesBean> frames) {
            this.frames = frames;
        }

        public static class ZipUrlsBean {
            /**
             * medium : https://i.pximg.net/img-zip-ugoira/img/2014/11/04/02/25/15/46907945_ugoira600x600.zip
             */

            private String medium;

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }

        public static class FramesBean {
            /**
             * file : 000000.jpg
             * delay : 50
             */

            private String file;
            private int delay;

            public String getFile() {
                return file;
            }

            public void setFile(String file) {
                this.file = file;
            }

            public int getDelay() {
                return delay;
            }

            public void setDelay(int delay) {
                this.delay = delay;
            }
        }
    }
}