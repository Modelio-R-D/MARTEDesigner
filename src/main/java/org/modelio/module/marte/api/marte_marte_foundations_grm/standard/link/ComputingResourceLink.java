/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("69be90c2-4cec-441f-8a4c-64b73d6f11a1")
    public static final String STEREOTYPE_NAME = "ComputingResource_Link";

    /**
     * Tells whether a {@link ComputingResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << ComputingResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ad435c6f-eda2-47fd-ad53-e5c5db20e8b6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << ComputingResource_Link >> then instantiate a {@link ComputingResourceLink} proxy.
     * 
     * @return a {@link ComputingResourceLink} proxy on the created {@link Link}.
     */
    @objid ("5af1dfb0-d82d-4647-88ff-4a37b364d48f")
    public static ComputingResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceLink.STEREOTYPE_NAME);
        return ComputingResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link ComputingResourceLink} proxy from a {@link Link} stereotyped << ComputingResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link ComputingResourceLink} proxy or <i>null</i>.
     */
    @objid ("c79575e9-09a8-4ff8-b4a6-536f7243fd47")
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
    @objid ("43427a0c-420e-4474-8547-2f6c88121174")
    public static ComputingResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (ComputingResourceLink.canInstantiate(obj))
        	return new ComputingResourceLink(obj);
        else
        	throw new IllegalArgumentException("ComputingResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6a91637a-014d-427d-a960-44ed1ba84f49")
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
    @objid ("2cf22c52-8009-494c-b89c-8ec1fcce23af")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("dedb6d80-a9aa-484e-beca-ac2a53678ed5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2bfe67ba-4dd7-43f9-81e7-65ed96d7c595")
    protected ComputingResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("246ce161-f6ed-471d-8954-a714fb87d66f")
    public static final class MdaTypes {
        @objid ("fa9b6a8d-5706-4588-9cc8-b22d7100330a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("014b79d3-5819-4860-aa8b-2f88f3babd71")
        private static Stereotype MDAASSOCDEP;

        @objid ("a885739b-fcdd-41bd-a1ad-9f4a2574597f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a77920bd-f89f-4fef-b58c-29eae0162138")
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
