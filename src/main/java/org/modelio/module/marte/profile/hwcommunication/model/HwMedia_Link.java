package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("8bf12b12-d4d6-4dac-a66d-b32049e29eb2")
public class HwMedia_Link {
    @objid ("db962da2-9f55-40cf-9030-105a827c81a7")
    protected Link element;

    @objid ("100fbb24-dfc2-4cfd-87ce-4ea725164fa9")
    public HwMedia_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMEDIA_LINK);
        this.element.setName(MARTEResourceManager.getName("HwMedia_Link"));
    }

    @objid ("68b19d45-926f-4cd1-9f29-1b43568db54a")
    public HwMedia_Link(Link element) {
        this.element = element;
    }

    @objid ("f5dd20eb-ce6c-45e5-854a-91462189f10c")
    public void setParent(Instance source, Instance destination) {
        ModelUtils.attachLink(this.element, source, destination);
    }

    @objid ("3aab0a94-c0d4-40b7-9b7c-34d78b072750")
    public Link getElement() {
        return this.element;
    }

    @objid ("16f47d10-98b4-430d-b324-eb973c8776a9")
    public String getarbiters() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEDIA_LINK_HWMEDIA_LINK_ARBITERS, this.element);
    }

    @objid ("8cfedeed-ebed-4fb8-84d3-0276957b3fdf")
    public void setarbiters(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEDIA_LINK_HWMEDIA_LINK_ARBITERS, value);
    }

}
