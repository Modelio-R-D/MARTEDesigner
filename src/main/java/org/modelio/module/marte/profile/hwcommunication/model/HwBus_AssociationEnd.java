package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ec7247c4-3a97-4427-ba35-dc55e63e6283")
public class HwBus_AssociationEnd extends HwMedia_AssociationEnd {
    @objid ("95a84f29-b71d-4568-b34a-80be07666951")
    public HwBus_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBUS_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwBus_AssociationEnd"));
    }

    @objid ("1e25d0cc-b7da-495f-9a80-52d841002dd1")
    public HwBus_AssociationEnd(AssociationEnd element) {
        super(element);
    }

    @objid ("2d8ddc1d-e0f1-43fa-a120-b5b0f612642d")
    public String getadressWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ADRESSWIDTH, this.element);
    }

    @objid ("0f2ccff7-31bb-43ea-b2b7-ab6452ddc56a")
    public void setadressWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ADRESSWIDTH, value);
    }

    @objid ("eda20cdb-3c5d-44f5-be1b-9bc556f975a3")
    public String getwordWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_WORDWIDTH, this.element);
    }

    @objid ("754e5c82-82d4-4f5b-a8e7-6cbdad179389")
    public void setwordWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_WORDWIDTH, value);
    }

    @objid ("9a84c1d8-c294-46c7-8210-955357f1697d")
    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ISSYNCHRONOUS, this.element);
    }

    @objid ("ebf28b15-bf1f-48d0-bab7-0a050e408ba2")
    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ISSYNCHRONOUS,value);
    }

    @objid ("65189968-1db6-4c19-9a21-68f8db7049bc")
    public boolean isisSerial() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ISSERIAL, this.element);
    }

    @objid ("7fe702e3-59e0-43b3-b798-2e8a0a79252d")
    public void isisSerial(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ISSERIAL,value);
    }

    @objid ("ca5b41ee-b7a9-43ad-89fc-9c717946364d")
    public AssociationEnd getElement() {
        return this.element;
    }

}
