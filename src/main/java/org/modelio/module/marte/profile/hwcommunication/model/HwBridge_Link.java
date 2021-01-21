package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c57b01dc-f9c2-477d-9953-33b793a6d9bf")
public class HwBridge_Link {
    @objid ("05e8a745-e5ec-4648-84ad-09fe7cadb8f8")
    protected Link element;

    @objid ("ce197915-8c77-4b0d-a9fa-e46e0c9397c3")
    public HwBridge_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRIDGE_LINK);
        this.element.setName(MARTEResourceManager.getName("HwBridge_Link"));
    }

    @objid ("a515d485-df56-475c-8875-36ac887bda7f")
    public HwBridge_Link(Link element) {
        this.element = element;
    }

    @objid ("d248bde4-dc67-434b-ba2b-fe794e5df0c8")
    public void setParent(Instance source, Instance destination) {
        ModelUtils.attachLink(this.element, source, destination);
    }

    @objid ("fba5f7ed-7bba-46db-9002-54e1a567bd7d")
    public Link getElement() {
        return this.element;
    }

    @objid ("83b7ce43-f85b-4781-8b95-adebcdfcc78b")
    public String getsides() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBRIDGE_LINK_HWBRIDGE_LINK_SIDES, this.element);
    }

    @objid ("a1451f9e-9052-447d-a1af-538a7fd4bba7")
    public void setsides(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBRIDGE_LINK_HWBRIDGE_LINK_SIDES, value);
    }

}
