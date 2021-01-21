/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.extensions.infrastructure.dependency;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_subUsage_ResourceUsage >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1293f547-1da4-4aef-a5ff-a3942e4050b3")
public class ProfileAssociationSubUsageResourceUsage {
    @objid ("084c40be-7bf8-476a-a243-34191880c188")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_subUsage_ResourceUsage";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("c4d55aa5-90de-4f48-880e-c0554b02b4a6")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationSubUsageResourceUsage proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_subUsage_ResourceUsage >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("93e3017d-d60a-444c-878b-e287a908a6bf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSubUsageResourceUsage.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_subUsage_ResourceUsage >> then instantiate a {@link ProfileAssociationSubUsageResourceUsage} proxy.
     * 
     * @return a {@link ProfileAssociationSubUsageResourceUsage} proxy on the created {@link Dependency}.
     */
    @objid ("d034e176-bd0b-46bc-85b7-c06c1b877e4c")
    public static ProfileAssociationSubUsageResourceUsage create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSubUsageResourceUsage.STEREOTYPE_NAME);
        return ProfileAssociationSubUsageResourceUsage.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSubUsageResourceUsage} proxy from a {@link Dependency} stereotyped << ProfileAssociation_subUsage_ResourceUsage >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationSubUsageResourceUsage} proxy or <i>null</i>.
     */
    @objid ("3a5ead5e-8a1a-41de-81e5-c720dfa35a2f")
    public static ProfileAssociationSubUsageResourceUsage instantiate(final Dependency obj) {
        return ProfileAssociationSubUsageResourceUsage.canInstantiate(obj) ? new ProfileAssociationSubUsageResourceUsage(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSubUsageResourceUsage} proxy from a {@link Dependency} stereotyped << ProfileAssociation_subUsage_ResourceUsage >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationSubUsageResourceUsage} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c20e10ae-353d-465e-b762-5b313a4379b0")
    public static ProfileAssociationSubUsageResourceUsage safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationSubUsageResourceUsage.canInstantiate(obj))
        	return new ProfileAssociationSubUsageResourceUsage(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationSubUsageResourceUsage: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3ded9c5b-2aa7-4a27-a961-0ace86229de7")
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
        ProfileAssociationSubUsageResourceUsage other = (ProfileAssociationSubUsageResourceUsage) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("2994d841-7eed-48cd-9ebf-08ded5bf952b")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("b2c2c316-9b18-40a8-8e08-feb4e75f4faf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5810c294-f241-44af-a437-8591ffdf781c")
    protected ProfileAssociationSubUsageResourceUsage(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("07acd9d3-d7aa-4357-b2ce-861ab6bfee26")
    public static final class MdaTypes {
        @objid ("d1dfab50-0aa3-47d5-b40c-18db379504a7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d2fc2b32-0664-407f-9c3b-88792bbfe3a1")
        private static Stereotype MDAASSOCDEP;

        @objid ("3b77bda2-3df1-4172-ad07-deaf0b6f0408")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d0b56b77-7d8d-4cee-a876-f40e52d4ca9e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "40465e0e-9816-11e0-a4c3-0027103f347c");
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
