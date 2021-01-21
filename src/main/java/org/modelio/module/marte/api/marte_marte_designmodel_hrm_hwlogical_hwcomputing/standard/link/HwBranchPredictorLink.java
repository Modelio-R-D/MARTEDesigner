/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.link.HwResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwBranchPredictor_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("21238c7c-db30-46b5-aba0-c7ac68082100")
public class HwBranchPredictorLink extends HwResourceLink {
    @objid ("dcdbc7d8-dc1e-436e-99a9-475cf69460c2")
    public static final String STEREOTYPE_NAME = "HwBranchPredictor_Link";

    /**
     * Tells whether a {@link HwBranchPredictorLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwBranchPredictor_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("990f6e96-6298-4840-b126-af197c990c8b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwBranchPredictor_Link >> then instantiate a {@link HwBranchPredictorLink} proxy.
     * 
     * @return a {@link HwBranchPredictorLink} proxy on the created {@link Link}.
     */
    @objid ("9977852d-8561-4c12-9d17-a99ca4a28067")
    public static HwBranchPredictorLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorLink.STEREOTYPE_NAME);
        return HwBranchPredictorLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorLink} proxy from a {@link Link} stereotyped << HwBranchPredictor_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwBranchPredictorLink} proxy or <i>null</i>.
     */
    @objid ("6336c26a-cfde-45e9-9e63-e02f39944945")
    public static HwBranchPredictorLink instantiate(final Link obj) {
        return HwBranchPredictorLink.canInstantiate(obj) ? new HwBranchPredictorLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorLink} proxy from a {@link Link} stereotyped << HwBranchPredictor_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwBranchPredictorLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2d4fe2cc-2184-45df-81db-934afccdccca")
    public static HwBranchPredictorLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwBranchPredictorLink.canInstantiate(obj))
        	return new HwBranchPredictorLink(obj);
        else
        	throw new IllegalArgumentException("HwBranchPredictorLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("81f1850e-855f-40c2-bb86-3d1003fa6f26")
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
        HwBranchPredictorLink other = (HwBranchPredictorLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("a73a8090-1669-469c-b1d5-bd02a35b4ff3")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("7021b5e6-d906-406d-8add-e2a6d67d03fb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("4838ca8f-8273-4772-9bf0-6e2d06753379")
    protected HwBranchPredictorLink(final Link elt) {
        super(elt);
    }

    @objid ("1d480ba0-b29a-4536-a1c8-21877106128a")
    public static final class MdaTypes {
        @objid ("9fc9e1fb-110e-4614-a232-427cbbdec6f2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("126a3ecf-663c-4484-94fb-505bb2b3a495")
        private static Stereotype MDAASSOCDEP;

        @objid ("d7a48169-0ddc-4bb2-b92e-76494d209372")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6b111885-29d8-4eb4-886c-77171d1415cd")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00fc43f5-0ccf-11df-8525-001302895b2b");
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
