/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("f1c04cdf-444a-4689-8ad8-8a7259197eac")
    public static final String STEREOTYPE_NAME = "HwBranchPredictor_Link";

    /**
     * Tells whether a {@link HwBranchPredictorLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwBranchPredictor_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a70c2fa7-0b19-4cfe-ac72-be9d0ab36438")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwBranchPredictor_Link >> then instantiate a {@link HwBranchPredictorLink} proxy.
     * 
     * @return a {@link HwBranchPredictorLink} proxy on the created {@link Link}.
     */
    @objid ("4e77c283-cb25-42f1-af7e-e67a1b9a7043")
    public static HwBranchPredictorLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorLink.STEREOTYPE_NAME);
        return HwBranchPredictorLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorLink} proxy from a {@link Link} stereotyped << HwBranchPredictor_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwBranchPredictorLink} proxy or <i>null</i>.
     */
    @objid ("a187c71c-9513-4325-a9cf-47c25412795b")
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
    @objid ("eed82673-0ccf-4a5e-b078-075bd80a4cda")
    public static HwBranchPredictorLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwBranchPredictorLink.canInstantiate(obj))
        	return new HwBranchPredictorLink(obj);
        else
        	throw new IllegalArgumentException("HwBranchPredictorLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("04211ee4-a553-4915-9c3a-26231f379b90")
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
    @objid ("d1507a45-49bf-4c8b-bf69-900cb4a9bf74")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("3b552909-46d9-4764-899b-8db5983bd4af")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e977f559-591a-44c2-be1b-ef9f3e6d5eb3")
    protected HwBranchPredictorLink(final Link elt) {
        super(elt);
    }

    @objid ("1d480ba0-b29a-4536-a1c8-21877106128a")
    public static final class MdaTypes {
        @objid ("d6d5d166-c8bc-4a68-b1b4-2f9ee1809444")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b431f2f7-1edd-4aad-b84e-49dd055e6a6a")
        private static Stereotype MDAASSOCDEP;

        @objid ("f803fcaf-e671-4ed9-9d4f-b0b3d76e0dc9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1383646c-e605-4ca7-8cbe-41e1efc95a79")
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
