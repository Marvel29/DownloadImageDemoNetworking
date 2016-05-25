package com.gmail.marvelfds.downloadimagenetworking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    static final String URL_IMAGE ="http://www.nasa.gov/sites/default/files/styles/image_card_4x3_ratio/public/thumbnails/image/idcs1426.jpg";
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // disableTrictPolicy();
        imageView = (ImageView)findViewById(R.id.ivPhoto);
        //1 exercice 1 load image with out async-http
       // new ImageDownloadTask().execute(URL_IMAGE);

        // 2 exercice 2 using async-http library
       // downloadImagAsync(URL_IMAGE);




    }

    private void downloadImagAsync(String urlImage) {
        ImageLoader v;

    }
   /* // exercice 2 using  async-http library
    private void downloadImagAsync(String urlImage) {
        AsyncHttpClient client = new AsyncHttpClient();
        String[] imageTypes = new String[] {"image/jpeg"};
        client.get(urlImage, new BinaryHttpResponseHandler(imageTypes) {

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] binaryData) {
                InputStream in = new ByteArrayInputStream(binaryData);
                Bitmap b = BitmapFactory.decodeStream(in);
                imageView.setImageBitmap(b);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] binaryData, Throwable error) {
                Toast.makeText(MainActivity.this," The image could not be found",Toast.LENGTH_LONG).show();
            }
        });
    }

*/

// exercice 1 load image without async-http
/*
    private  class ImageDownloadTask extends AsyncTask<String,Void,Bitmap> {

        @Override
        protected Bitmap doInBackground(String... params) {
            // get the URL from string
            java.net.URL urlImage = getUrlFromString (params[0]);

            //get the inputStream
            InputStream in = getInputStream(urlImage);

            // decode the inputStream
            Bitmap bitMap = decodeInputStream(in);

            return bitMap;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {

            imageView.setImageBitmap(bitmap);
        }

        private java.net.URL getUrlFromString(String urlImage) {
            URL url ;
            try{
                url = new URL(urlImage);
            }
            catch (MalformedURLException ex){
                url = null;
                ex.printStackTrace();
            }
            return url;
        }

        private InputStream getInputStream(java.net.URL url){
            InputStream in;
            // open connection
            URLConnection conn;
            try {
                conn =url.openConnection();
                conn.connect();
                in = conn.getInputStream();
            }
            catch (IOException ex){
                ex.printStackTrace();
                in =null;
            }
            return in;
        }
        private Bitmap decodeInputStream(InputStream in) {
            Bitmap b ;
            try{
                b = BitmapFactory.decodeStream(in);
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
                b =null;
                in =null;

            }
            return b;
        }
    }


*/


}