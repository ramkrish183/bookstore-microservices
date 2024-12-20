document.addEventListener('alpine:init', () => {
    Alpine.data('initData', (pageNo) => ({
        pageNo: pageNo,
        products: {
            data: []
        },
        init() {
        console.log("Page NO "+pageNo);
            this.loadProducts(this.pageNo);
           // updateCartItemCount();
        },
        loadProducts(pageNo) {
            $.getJSON("/api/products?page="+pageNo, (resp)=> {
                console.log("Products Resp:", resp)
                this.products = resp;
            });
        },
         addToCart(product) {
            addProductToCart(product)
         }
    }))
});