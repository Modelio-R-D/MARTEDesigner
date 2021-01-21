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

@objid ("4583327e-edab-4091-9f2f-fe30ae24bc59")
public class HwTimer_AttributeProperty implements IPropertyContent {
    @objid ("3d7f9053-5285-4763-9d74-6da8d4f513e9")
    private static List<ModelElement> listHwClock = null;

    @objid ("26e43218-0ecb-4d3f-96e6-106968c85429")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWTIMER_ATTRIBUTE_HWTIMER_ATTRIBUTE_COUNTERWIDTH, value);
        }
        else if(row == 2){
            ModelUtils.manageSingleOrientedLink(elt, 
                    listHwClock, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_INPUTCLOCK_HWTIMER_HWCLOCK, 
        //                    MARTEDesignerTagTypes.HWTIMER_ATTRIBUTE_HWTIMER_ATTRIBUTE_INPUTCLOCK, 
                    value
            );
        
        }
        else if (row == 3) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWTIMER_ATTRIBUTE_HWTIMER_ATTRIBUTE_NBCOUNTERS, value);
        }
    }

    @objid ("d2e5616d-c37b-431d-a421-15e25988ebe1")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Timer
        //
        String value_nbCounters = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_ATTRIBUTE_HWTIMER_ATTRIBUTE_NBCOUNTERS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMER_ATTRIBUTE_HWTIMER_ATTRIBUTE_NBCOUNTERS),value_nbCounters);
        
        listHwClock = MARTESearchUtils.searchHwClock();
        String[] tab_inputClock = ModelUtils.createListString(listHwClock);      
        String value_inputClock = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_INPUTCLOCK_HWTIMER_HWCLOCK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMER_ATTRIBUTE_HWTIMER_ATTRIBUTE_INPUTCLOCK), value_inputClock, tab_inputClock);
        
        
        String value_counterWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_ATTRIBUTE_HWTIMER_ATTRIBUTE_COUNTERWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMER_ATTRIBUTE_HWTIMER_ATTRIBUTE_COUNTERWIDTH),value_counterWidth);
    }

}
