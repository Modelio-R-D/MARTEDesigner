/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.associationend.HwResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwBranchPredictor_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7b417da6-4c9d-42bb-a44a-7dc3fd7bc086")
public class HwBranchPredictorAssociationEnd extends HwResourceAssociationEnd {
    @objid ("16c0955b-b0db-4099-8cd3-0bc96a2ed8fe")
    public static final String STEREOTYPE_NAME = "HwBranchPredictor_AssociationEnd";

    /**
     * Tells whether a {@link HwBranchPredictorAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwBranchPredictor_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("22f60ee3-f3fd-4ad5-b4ec-09fc4be61d0d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwBranchPredictor_AssociationEnd >> then instantiate a {@link HwBranchPredictorAssociationEnd} proxy.
     * 
     * @return a {@link HwBranchPredictorAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("bbe26f84-cf99-4f60-bf39-ab1417c6d5e5")
    public static HwBranchPredictorAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorAssociationEnd.STEREOTYPE_NAME);
        return HwBranchPredictorAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwBranchPredictor_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwBranchPredictorAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("274ffb06-4e40-420c-9ad9-86314125cfc6")
    public static HwBranchPredictorAssociationEnd instantiate(final AssociationEnd obj) {
        return HwBranchPredictorAssociationEnd.canInstantiate(obj) ? new HwBranchPredictorAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwBranchPredictor_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwBranchPredictorAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7735e1c6-d2eb-4427-a02e-d8d4e42550c1")
    public static HwBranchPredictorAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwBranchPredictorAssociationEnd.canInstantiate(obj))
        	return new HwBranchPredictorAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwBranchPredictorAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3cbbe2d1-27c6-4d73-a156-c6249ad8a647")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        HwBranchPredictorAssociationEnd other = (HwBranchPredictorAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("0c8f54b5-f313-4e7f-b5ed-b1612fc6ccca")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("a67633ff-2dcd-4031-8d2d-ea17266ba078")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("bdeda7be-3f5d-47cb-b647-8452628edb53")
    protected HwBranchPredictorAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("a7db7695-e622-4dc1-9e0a-b51bd4c16131")
    public static final class MdaTypes {
        @objid ("2711354e-0043-4cd1-9736-13461b902ae0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("490e48a2-ed83-425e-a614-f736e25bea84")
        private static Stereotype MDAASSOCDEP;

        @objid ("133ff89b-2bff-4ca7-b054-53ad5fed10cf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4b4090b4-7778-4716-9fcc-59e7a25b4138")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00fc43f1-0ccf-11df-8525-001302895b2b");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
