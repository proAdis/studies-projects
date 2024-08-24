

//<script src="shop.js"> </script>
<script src="cart.js"></script>
cart.forEach(cartItem => {
`



`
     
});


function addToCart(productId)
{    let matchingItem;

      cart.forEach((cartItem) => {
        if (productId === cartItem.productId) {
          matchingItem = cartItem;  }
      });

      if (matchingItem) {
        matchingItem.quantity += 1;
      } else {
        cart.push({
          productId: productId,
          quantity: 1  });  
        }
        saveToStorage();
      }
        

      function removeFromCart(productId) {
        const newCart = [];
      
        cart.forEach((cartItem) => {
          if (cartItem.productId !== productId) {
            newCart.push(cartItem);
          }
        });
      
        cart = newCart;
      
        saveToStorage();
      }
      
      function updateQuantity()
      {   let cartQuantity = 0;
      
      cart.forEach((cartItem) => {
        cartQuantity += cartItem.quantity;});
      
      document.querySelector('.js-cart-quantity')
        .innerHTML = cartQuantity;   }
      
        function removeFromCart(productId)
        {
           const newCart=[];
          cart.forEach((cartItem)=>{
                 if(cartItem.productId!==productId)
                 {    newCart.push(cartItem) }
          });
          cart=newCart;
          saveToStorage();
      
            }