package org.modelio.module.marte.profile.datatypes.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c87180a8-db57-4c30-b480-037c180f2b61")
public class TupleType_DataType {
    @objid ("85d38765-a1d8-4eff-8e2b-3dd91e5fae5c")
    protected DataType element;

    @objid ("29150957-5e8b-4fba-bd9a-5076bfc15853")
    public TupleType_DataType() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDataType();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TUPLETYPE_DATATYPE);
        this.element.setName(MARTEResourceManager.getName("TupleType_DataType"));
    }

    @objid ("0ef46a4a-5e3d-4cdc-8fef-50fbc5ec67b5")
    public TupleType_DataType(DataType element) {
        this.element = element;
    }

    @objid ("93363922-52d1-491b-9438-0d4f26898f52")
    public DataType getElement() {
        return this.element;
    }

    @objid ("f68149fa-34c8-46cd-b5d5-27b1eaef31db")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

}
