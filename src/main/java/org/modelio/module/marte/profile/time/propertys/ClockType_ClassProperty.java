package org.modelio.module.marte.profile.time.propertys;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4d460ae3-a4b9-4377-bcd2-6e8fd13d8e2d")
public class ClockType_ClassProperty implements IPropertyContent {
    @objid ("9318a9bb-1b91-4f1a-b286-42b1759de6bd")
    private static List<ModelElement> listUnitType = null;

    @objid ("fb435c20-f061-4c3b-a555-24cfa0a4b03a")
    private static List<ModelElement> listResolAtt = null;

    @objid ("0c4bcc62-fb0c-4ea3-8ea8-ded05329fbbe")
    private static List<ModelElement> listMaxValAtt = null;

    @objid ("6bbaec00-2689-40f9-a93c-e03ef9bca45f")
    private static List<ModelElement> listOffsetAtt = null;

    @objid ("ebbc6848-a7b2-4972-b3f1-7e726e93e45a")
    private static List<ModelElement> listGetTime = null;

    @objid ("50042627-0ba4-4ce1-94d0-41b7b4ebc57f")
    private static List<ModelElement> listSetTime = null;

    @objid ("fe11e419-c420-450f-ac97-a0f40bb4f8a3")
    private static List<ModelElement> listIndexToValue = null;

    @objid ("6e9a41e9-a16c-41f8-be80-959e05d24ce8")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_NATURE, value);
        }
        else if(row == 2){
            ModelUtils.manageSingleOrientedLink(elt, 
                                                listUnitType, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_UNITTYPE_CLOCKTYPE_ENUMERATION, 
        //                                                MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_UNITTYPE,
                                                value );
        }
        else if(row == 3){
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_ISLOGICAL, value);
            
        }
        else if(row == 4){
            ModelUtils.manageSingleOrientedLink(elt, 
                                                listResolAtt, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_RESOLATTR_CLOCKTYPE_ATTRIBUTE, 
        //                                                MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_RESOLATTR,
                                                value );
        }
        else if(row == 5){
            ModelUtils.manageSingleOrientedLink(elt, 
                                                listMaxValAtt, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_MAXVALATTR_CLOCKTYPE_ATTRIBUTE, 
        //                                                MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_MAXVALATTR,
                                                value );
        }
        else if(row == 6){
            ModelUtils.manageSingleOrientedLink(elt, 
                                                listOffsetAtt, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_OFFSETATTR_CLOCKTYPE_ATTRIBUTE, 
        //                                                MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_OFFSETATTR,
                                                value );
                                        
        }
        else if(row == 7){
            ModelUtils.manageSingleOrientedLink(elt, 
                                                listGetTime, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_GETTIME_CLOCKTYPE_OPERATION, 
        //                                                MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_GETTIME,
                                                value );
        }
        else if(row == 8){
            ModelUtils.manageSingleOrientedLink(elt, 
                                                listSetTime, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_SETTIME_CLOCKTYPE_OPERATION, 
        //                                                MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_SETTIME,
                                                value );
        }
        else if(row == 9){
            ModelUtils.manageSingleOrientedLink(elt, 
                                                listIndexToValue, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_INDEXTOVALUE_CLOCKTYPE_OPERATION, 
        //                                                MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_INDEXTOVALUE,
                                                value );
        }
    }

    @objid ("60b9c390-ce2a-44c8-a1c6-badeba379e55")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        /*
         * Clock Type
         */
        
        // Nature tagged value
        String[] types = MARTEEnumerationUtils.getTimeNatureKind();
        String value_nature = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_NATURE, elt);
        if (!(MARTEEnumerationUtils.isTimeNatureKind(value_nature))){
            value_nature = types[0];
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_NATURE),value_nature, types);
        
        /* 
         * UnitType Tagged Value
         */
        listUnitType = ModelUtils.searchElement(Enumeration.class);
        types = ModelUtils.createListString(listUnitType);
        String value_unitType = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_UNITTYPE_CLOCKTYPE_ENUMERATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_UNITTYPE),value_unitType, types);
        
        /*
         *  isLogical tagged value
         */
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_ISLOGICAL),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_ISLOGICAL, elt));
        
        
        // resolAttr tagged value
        listResolAtt = ModelUtils.searchElement(Attribute.class, elt);
        String[] tabResolAtt = ModelUtils.createListString(listResolAtt);
        String value_resolAttr = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_RESOLATTR_CLOCKTYPE_ATTRIBUTE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_RESOLATTR),value_resolAttr, tabResolAtt);
        
        // maxValAttr tagged value
        listMaxValAtt = ModelUtils.searchElement(Attribute.class, elt);
        String[] tabMaxValAtt = ModelUtils.createListString(listMaxValAtt);
        String value_maxValAttr = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MAXVALATTR_CLOCKTYPE_ATTRIBUTE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_MAXVALATTR),value_maxValAttr, tabMaxValAtt);
        
        // offsetAttr tagged value
        listOffsetAtt = ModelUtils.searchElement(Attribute.class, elt);
        String[] tabOffsetAtt = ModelUtils.createListString(listOffsetAtt);
        String value_offsetAttr = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OFFSETATTR_CLOCKTYPE_ATTRIBUTE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_OFFSETATTR),value_offsetAttr, tabOffsetAtt);
        
        // getTime tagged value
        listGetTime = ModelUtils.searchElement(Operation.class, elt);
        String[] tabGetTime = ModelUtils.createListString(listGetTime);
        String value_getTime = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_GETTIME_CLOCKTYPE_OPERATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_GETTIME),value_getTime, tabGetTime);
        
        // setTime tagged value
        listSetTime = ModelUtils.searchElement(Operation.class, elt);
        String[] tabSetTime = ModelUtils.createListString(listSetTime);
        String value_setTime = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SETTIME_CLOCKTYPE_OPERATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_SETTIME),value_setTime, tabSetTime);
        
        // indexToValue tagged value
        listIndexToValue = ModelUtils.searchElement(Operation.class, elt);
        String[] tabIndexToValue = ModelUtils.createListString(listIndexToValue);
        String value_indexToValue = ModelUtils.getTargetDependencyNames( MARTEDesignerStereotypes.PROFILEASSOCIATION_INDEXTOVALUE_CLOCKTYPE_OPERATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_INDEXTOVALUE),value_indexToValue, tabIndexToValue);
    }

    @objid ("2eefbd33-f2f5-4e40-80bb-c78d5ec453c6")
    protected List<ModelElement> unitChecking(List<ModelElement> listEnum) {
        List<ModelElement> result = new ArrayList<>();
        for (ModelElement plouf:listEnum) {
            Enumeration e = (Enumeration)plouf;
            boolean hasUnit = false;
            for (EnumerationLiteral l:e.getValue()) {
                if(l.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.UNIT_ENUMERATIONLITERAL)) {
                    hasUnit = true;
                }
            }
            if (hasUnit) {
                result.add(e);
            }
        }
        return result;
    }

}
