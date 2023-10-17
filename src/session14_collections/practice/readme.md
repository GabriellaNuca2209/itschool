# Models package
- User, Product, ShoppingCart (entities)
- just properties (name, email, password)
- getters & setters
- toString
- equals & hashcode

# Services package
- UserService, ProductService, ShoppingCartService (interfaces)
- UserServiceImpl, ProductServiceImpl, ShoppingCartServiceImpl (concrete classes)
- UserService -> createUser(User user), updateUser(), deleteUser(), getUser()

# Repositories package (communication with DB)
- UserRepository, ProductRepository, ShoppingCartRepository (interfaces)