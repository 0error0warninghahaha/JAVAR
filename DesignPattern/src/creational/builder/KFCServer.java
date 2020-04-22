package creational.builder;

public class KFCServer {
	private MealBuilder mealBuilder;

    public KFCServer(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal construct(){
        //准备食物
        mealBuilder.buildFood();
        //准备饮料
        mealBuilder.buildDrink();
        
        return mealBuilder.getMeal();
    }
}
