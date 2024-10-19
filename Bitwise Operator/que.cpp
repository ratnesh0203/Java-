class Solution {
  public:
    long long maximizeTheFuel(int n, int a, int b) {
    int currentFuel=0;
    int maxFuelA = min(n, currentFuel+a);
    int maxFuelB = min(n, currentFuel+b);
    int maxFuelHalf = (currentFuel==n) ? currentFuel : max(currentFuel/2 , 0);
    return max({maxFuelA , maxFuelB , maxFuelhalf});
    }
};
