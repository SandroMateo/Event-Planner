class Event {

  private int mGuestNumber;
  private String mFoodType;
  private String mDrinkType;
  private String mEntertainmentType;

  public Event(int guestNumber, String foodType, String drinkType, String entertainmentType) {
    mGuestNumber = guestNumber;
    mFoodType = foodType;
    mDrinkType = drinkType;
    mEntertainmentType = entertainmentType;
  }

  public int getGuestNumber() {
    return mGuestNumber;
  }
}
