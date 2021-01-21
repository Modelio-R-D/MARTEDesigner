package org.modelio.module.marte.profile.datatypes.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c84f316c-88bb-4e87-b432-26996af14436")
public class CollectionType_DataType {
    @objid ("bdd78592-21e6-48e0-8daf-a3ed12b8beef")
    protected DataType element;

    @objid ("f376fab5-fa6d-4fdc-883a-8d513dc5d65e")
    public CollectionType_DataType() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDataType();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COLLECTIONTYPE_DATATYPE);
        this.element.setName(MARTEResourceManager.getName("CollectionType_DataType"));
    }

    @objid ("211ff136-de47-4337-adc0-e51d97d9a092")
    public CollectionType_DataType(DataType element) {
        this.element = element;
    }

    @objid ("f259894c-7fd4-470a-92d7-e4583a1e0a11")
    public DataType getElement() {
        return this.element;
    }

    @objid ("2b323bf7-6aad-4eda-b6c9-fe540bd6661c")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("e5550746-677e-47ae-aed7-113738e6b703")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
