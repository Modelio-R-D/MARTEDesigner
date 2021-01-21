package org.modelio.module.marte.profile.hwtiming.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("debd41bf-20ee-4e58-9cd3-c9c4d46e7618")
public class HwTimer_AssociationEndProperty implements IPropertyContent {
    @objid ("fa2f9030-c208-4844-933b-23803fe19d60")
    private static List<ModelElement> listHwClock = null;

    @objid ("91eb1ba5-10f1-47be-b3ce-90420fc1e2c5")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWTIMER_ASSOCIATIONEND_HWTIMER_ASSOCIATIONEND_COUNTERWIDTH, value);
        }
        else if(row == 2){
            ModelUtils.manageSingleOrientedLink(elt, 
                    listHwClock, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_INPUTCLOCK_HWTIMER_HWCLOCK, 
        //                    MARTEDesignerTagTypes.HWTIMER_ASSOCIATIONEND_HWTIMER_ASSOCIATIONEND_INPUTCLOCK, 
                    value
            );
        
        }
        else if (row == 3) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWTIMER_ASSOCIATIONEND_HWTIMER_ASSOCIATIONEND_NBCOUNTERS, value);
        }
    }

    @objid ("9e8cf0d5-6991-411a-ac1f-40a2ac0f14e4")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Timer
        //
        String value_nbCounters = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_ASSOCIATIONEND_HWTIMER_ASSOCIATIONEND_NBCOUNTERS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMER_ASSOCIATIONEND_HWTIMER_ASSOCIATIONEND_NBCOUNTERS),value_nbCounters);
        
        listHwClock = MARTESearchUtils.searchHwClock();
        String[] tab_inputClock = ModelUtils.createListString(listHwClock);      
        String value_inputClock = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_INPUTCLOCK_HWTIMER_HWCLOCK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMER_ASSOCIATIONEND_HWTIMER_ASSOCIATIONEND_INPUTCLOCK), value_inputClock, tab_inputClock);
        
        
        String value_counterWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_ASSOCIATIONEND_HWTIMER_ASSOCIATIONEND_COUNTERWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMER_ASSOCIATIONEND_HWTIMER_ASSOCIATIONEND_COUNTERWIDTH),value_counterWidth);
    }

}
