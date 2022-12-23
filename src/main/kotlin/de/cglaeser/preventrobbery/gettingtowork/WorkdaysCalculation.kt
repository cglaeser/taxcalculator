package de.cglaeser.preventrobbery.gettingtowork

class WorkdaysCalculation {
    fun calculateHomeOfficeTaxRebate(days: Int) : Int {
    return (days*5)
    }

    fun calculateDistanceTaxRebate(distanceInKilometers: Int) : Double {
        var distanceAbove20 = 0;
        var distanceUpTo20 = distanceInKilometers;
        if(distanceInKilometers > 20)
                distanceAbove20 =  (distanceInKilometers - 20)
        else
            distanceAbove20 = 0;

        if(distanceAbove20 != 0)
            distanceUpTo20 = 20

        var distanceRebates =  0.0;
        distanceRebates += (distanceUpTo20 * 0.3)
        distanceRebates += (distanceAbove20 * 0.38)

        return distanceRebates;
    }

}