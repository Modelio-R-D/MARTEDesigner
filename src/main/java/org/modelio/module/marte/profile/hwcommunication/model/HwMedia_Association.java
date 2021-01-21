package org.modelio.module.marte.profile.hwcommunication.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("cdd8c43e-987d-4355-a966-1ff571ba59f0")
public class HwMedia_Association {
    @objid ("2c2e54a9-52f6-430b-bddc-f0ea926aaf87")
    protected Association element;

    @objid ("6d1f58ec-afbd-4056-996a-622b225d6bb0")
    public HwMedia_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMEDIA_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwMedia_Association"));
    }

    @objid ("dc4c1b30-360c-4e36-8960-69a8e86296a7")
    public HwMedia_Association(Association element) {
        this.element = element;
    }

    @objid ("27cecda4-8cf0-4be6-b308-2a9d3892f45e")
    public void setParent(Classifier source, Classifier destination) {
        ModelUtils.attachAssociation(this.element, source, destination);
    }

    @objid ("5ce2a97d-68ec-4cf2-9251-91a2a92251d1")
    public Association getElement() {
        return this.element;
    }

    @objid ("73853781-5618-4723-b19e-17d9822824bd")
    public String getarbiters() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEDIA_ASSOCIATION_HWMEDIA_ASSOCIATION_ARBITERS, this.element);
    }

    @objid ("a0d6041f-58f1-41b8-84a9-27ff41073f74")
    public void setarbiters(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEDIA_ASSOCIATION_HWMEDIA_ASSOCIATION_ARBITERS, value);
    }

    @objid ("c32a653a-de75-4751-8be9-dfd4bcd7b01b")
    public List<HwEndPoint_AssociationEnd> getHwEndPoint_AssociationEnd() {
        List<HwEndPoint_AssociationEnd> res = new java.util.ArrayList<>();        
        for(AssociationEnd end : this.element.getEnd()){
            res.add(new HwEndPoint_AssociationEnd(end));
        }
        return res;
    }

    @objid ("526ce254-7415-4fe0-bb2a-92dfaebd414e")
    public void addHwEndPoint_AssociationEnd(HwEndPoint_AssociationEnd model) {
        this.element.getEnd().add(model.getElement());
    }

}
