public class Main
{
  public static void main(String[] args)
  {
    Model shopModel = new DummyModel();
    
    ShopController c = new ShopController(shopModel);
    c.init();
  }
}
