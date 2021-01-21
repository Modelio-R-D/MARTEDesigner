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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_intervalAttrib_IntervalType_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8135a05d-90f0-4b3d-9caf-a5d28c8fa0c9")
public class ProfileAssociationIntervalAttribIntervalTypeAttribute {
    @objid ("4a40e7dd-ed59-474f-a1ca-311273c5456d")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_intervalAttrib_IntervalType_Attribute";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("51c09b9a-33b4-48c6-afa2-8644204ea218")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationIntervalAttribIntervalTypeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_intervalAttrib_IntervalType_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2e06f46e-a302-4cc6-8fb0-a10ad16f8227")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationIntervalAttribIntervalTypeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_intervalAttrib_IntervalType_Attribute >> then instantiate a {@link ProfileAssociationIntervalAttribIntervalTypeAttribute} proxy.
     * 
     * @return a {@link ProfileAssociationIntervalAttribIntervalTypeAttribute} proxy on the created {@link Dependency}.
     */
    @objid ("95bec341-ddbc-435e-bfbe-4aa13ef6f356")
    public static ProfileAssociationIntervalAttribIntervalTypeAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationIntervalAttribIntervalTypeAttribute.STEREOTYPE_NAME);
        return ProfileAssociationIntervalAttribIntervalTypeAttribute.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationIntervalAttribIntervalTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_intervalAttrib_IntervalType_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationIntervalAttribIntervalTypeAttribute} proxy or <i>null</i>.
     */
    @objid ("ef5b8332-b096-4adc-98ad-0e180cdb3246")
    public static ProfileAssociationIntervalAttribIntervalTypeAttribute instantiate(final Dependency obj) {
        return ProfileAssociationIntervalAttribIntervalTypeAttribute.canInstantiate(obj) ? new ProfileAssociationIntervalAttribIntervalTypeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationIntervalAttribIntervalTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_intervalAttrib_IntervalType_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationIntervalAttribIntervalTypeAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b8d96817-ff99-4f11-b21f-b9839f79b296")
    public static ProfileAssociationIntervalAttribIntervalTypeAttribute safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationIntervalAttribIntervalTypeAttribute.canInstantiate(obj))
        	return new ProfileAssociationIntervalAttribIntervalTypeAttribute(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationIntervalAttribIntervalTypeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("535635d2-f311-43c5-a745-813cc32a4994")
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
        ProfileAssociationIntervalAttribIntervalTypeAttribute other = (ProfileAssociationIntervalAttribIntervalTypeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("aaeb3dc8-2597-4a55-a6fe-4f416ab5772b")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("d0789685-44e8-4048-98b4-8a7a9d93fc74")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ca91df22-2d6a-4223-b0e6-b1ca4c03b350")
    protected ProfileAssociationIntervalAttribIntervalTypeAttribute(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("bc5cca33-b2b8-4070-98ee-edf6c659f39f")
    public static final class MdaTypes {
        @objid ("bc5a2680-b8f7-41cb-8c7f-13d0148ee2fb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bec55690-c9bf-40a0-ae81-dc3256cd88db")
        private static Stereotype MDAASSOCDEP;

        @objid ("653793d5-bfd7-41b7-89cc-d834cbca907a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("90cb6da9-2af0-4828-8e4c-d28456882608")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "acddc7c0-82b2-11df-b65a-0014222a9f79");
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
