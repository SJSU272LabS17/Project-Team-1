
function myfunction() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {

            obj = JSON.parse(this.responseText);

            var i = 0;
            while (i < obj.products.length) {
                var product_thumbnail = obj.products[i].image;
                var product_url = obj.products[i].url;
                var product_name = obj.products[i].name;
                var product_price = obj.products[i].price;
                var result = '<div class=\"col-lg-4 col-sm-6\"><script src=\"js/new_js.js\"></script><a href=\"' + product_url + '\" class=\"portfolio-box\"><img src=\"' + product_thumbnail + '\" class=\"img-responsive\" alt=\"\"' + 'hight="550px" width="200px" ' + '><div class=\"portfolio-box-caption\"><div class=\"portfolio-box-caption-content\" id=\"product_2\"><div class=\"project-category text-faded\">' + product_name + '</div><div class=\"project-name\">' + product_price + '</div></div></div></a></div>';

                document.getElementById('results').innerHTML += result;
                i++;
            }


            // document.getElementById("demo").innerHTML = this.responseText;
        }
    };

    // console.log('twitterHandle: ' + document.getElementById('twitter_id').value);
    // console.log('productName: ' + document.getElementById('search_product').value);
    var recommendation_url = 'http://localhost:9161/gobuy/recommendations?twitterHandle=' + document.getElementById('twitter_id').value + '&productName=' + document.getElementById('search_product').value;

    xhttp.open("GET", recommendation_url, true);
    xhttp.send();

    // var modal = document.getElementById("product_data");

    // var text = '{"products":[{"id":"PID13579","name":"Sony Xperia XA1 G3125 Plus 128GB","price":"$369","image":"https://images-na.ssl-images-amazon.com/images/I/51WdSeKnqLL._SX522_.jpg","url":"https://www.amazon.com/Sony-G3125-5-0-Inch-FACTORY-UNLOCKED/dp/B06XYJRM81/ref=sr_1_2?s=wireless&ie=UTF8&qid=1494885315&sr=1-2&keywords=xperia+xa1"},{"id":"PID13579","name":"Apple iPhone 7 Plus 128GB","price":"$999.99","image":"https://images-na.ssl-images-amazon.com/images/I/813c1CcCTPL._SX522_.jpg","url":"https://www.amazon.com/Apple-Factory-Unlocked-5-5-inch-Smartphone/dp/B06XYSZKL4/ref=sr_1_3?s=wireless&ie=UTF8&qid=1494709490&sr=1-3&keywords=iphone+7+plus"}],"_links":{"self":{"href":"http://localhost:8080/gobuy/recommendations?twitterHandle=avadh95&productName=phone"}}}';

    // obj = JSON.parse(text);


    // var i = 0;
    // while (i < obj.products.length) {
    //     var product_thumbnail = obj.products[i].image;
    //     var product_url = obj.products[i].url;
    //     var product_name = obj.products[i].name;
    //     var product_price = obj.products[i].price;
    //     var result = '<div class=\"col-lg-4 col-sm-6\"><script src=\"C:/Users/admin/Desktop/startbootstrap-creative-gh-pages/js/new_js.js\"></script><a href=\"' + product_url + '\" class=\"portfolio-box\"><img src=\"' + product_thumbnail + '\" class=\"img-responsive\" alt=\"\"' + 'hight="550px" width="200px" ' + '><div class=\"portfolio-box-caption\"><div class=\"portfolio-box-caption-content\" id=\"product_2\"><div class=\"project-category text-faded\">' + product_name + '</div><div class=\"project-name\">' + product_price + '</div></div></div></a></div>';

    //     document.getElementById('results').innerHTML += result;
    //     i++;
    // }
}