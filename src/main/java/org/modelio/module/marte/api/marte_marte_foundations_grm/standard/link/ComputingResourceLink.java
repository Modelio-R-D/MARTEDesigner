/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << ComputingResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("95fd3a4c-e174-42b1-bebb-45410bafdc2a")
public class ComputingResourceLink extends ProcessingResourceLink {
    @objid ("b9264cee-900b-4360-8faf-b0cf6090115d")
    public static final String STEREOTYPE_NAME = "ComputingResource_Link";

    /**
     * Tells whether a {@link ComputingResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << ComputingResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f73ee0f4-3f0f-44da-b3c5-5db66038d4f8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << ComputingResource_Link >> then instantiate a {@link ComputingResourceLink} proxy.
     * 
     * @return a {@link ComputingResourceLink} proxy on the created {@link Link}.
     */
    @objid ("80d3b4f3-28a7-4136-b6f4-b82c033e77c2")
    public static ComputingResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceLink.STEREOTYPE_NAME);
        return ComputingResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link ComputingResourceLink} proxy from a {@link Link} stereotyped << ComputingResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link ComputingResourceLink} proxy or <i>null</i>.
     */
    @objid ("b2c0c791-6a46-490f-865c-5cac432acf1d")
    public static ComputingResourceLink instantiate(final Link obj) {
        return ComputingResourceLink.canInstantiate(obj) ? new ComputingResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ComputingResourceLink} proxy from a {@link Link} stereotyped << ComputingResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link ComputingResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("501f7fd1-b2c7-498e-bb05-4904ab4c7b0c")
    public static ComputingResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (ComputingResourceLink.canInstantiate(obj))
        	return new ComputingResourceLink(obj);
        else
        	throw new IllegalArgumentException("ComputingResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("06460261-b10c-4778-8e7f-cd8279af242a")
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
        ComputingResourceLink other = (ComputingResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("1c83a17c-c1ef-4ecb-b903-3a53ca77f9f9")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("2cd2e32e-56a8-434d-81db-e6150e02a38f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0258f791-fe12-4228-ae34-0555d3504ba2")
    protected ComputingResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("246ce161-f6ed-471d-8954-a714fb87d66f")
    public static final class MdaTypes {
        @objid ("f05fc009-e2e5-4e7d-bab7-dbe02ac26643")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7aa1bdad-9a99-4ac0-9ad1-8d4799844246")
        private static Stereotype MDAASSOCDEP;

        @objid ("8393ab29-0f60-496f-b98e-81ab9eb4a94b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a879c307-691a-47bc-89d9-e7cc09ff45c0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009a84d3-0ccf-11df-8525-001302895b2b");
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
