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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_baseDimension_Dimension_Dimension >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("854c55dc-94ec-4478-abf9-8976b7a965ca")
public class ProfileAssociationBaseDimensionDimensionDimension {
    @objid ("74f51579-a8a3-420f-b5fb-bafc9207c923")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_baseDimension_Dimension_Dimension";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("4bcaacd5-f6bc-4923-815a-eac7f542d989")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationBaseDimensionDimensionDimension proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_baseDimension_Dimension_Dimension >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("29244e30-1c9b-4bec-860c-eefc6678456a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBaseDimensionDimensionDimension.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_baseDimension_Dimension_Dimension >> then instantiate a {@link ProfileAssociationBaseDimensionDimensionDimension} proxy.
     * 
     * @return a {@link ProfileAssociationBaseDimensionDimensionDimension} proxy on the created {@link Dependency}.
     */
    @objid ("92beddc7-3291-4321-b988-716d4fd4a9ea")
    public static ProfileAssociationBaseDimensionDimensionDimension create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBaseDimensionDimensionDimension.STEREOTYPE_NAME);
        return ProfileAssociationBaseDimensionDimensionDimension.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBaseDimensionDimensionDimension} proxy from a {@link Dependency} stereotyped << ProfileAssociation_baseDimension_Dimension_Dimension >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationBaseDimensionDimensionDimension} proxy or <i>null</i>.
     */
    @objid ("1a5a6089-5d61-4a4b-80b2-baa25639e526")
    public static ProfileAssociationBaseDimensionDimensionDimension instantiate(final Dependency obj) {
        return ProfileAssociationBaseDimensionDimensionDimension.canInstantiate(obj) ? new ProfileAssociationBaseDimensionDimensionDimension(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBaseDimensionDimensionDimension} proxy from a {@link Dependency} stereotyped << ProfileAssociation_baseDimension_Dimension_Dimension >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationBaseDimensionDimensionDimension} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cd438e74-ed80-4df4-8a5e-1dfe1bb60503")
    public static ProfileAssociationBaseDimensionDimensionDimension safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationBaseDimensionDimensionDimension.canInstantiate(obj))
        	return new ProfileAssociationBaseDimensionDimensionDimension(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationBaseDimensionDimensionDimension: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d53af191-7e33-4247-b4fd-ae98d9cec3b0")
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
        ProfileAssociationBaseDimensionDimensionDimension other = (ProfileAssociationBaseDimensionDimensionDimension) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("94f69110-566d-4a67-9ba5-45e309ec8259")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("b98764e0-52fd-453b-b2bf-634547e35263")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c92381a1-f1e7-4c74-9603-c3724bfd281d")
    protected ProfileAssociationBaseDimensionDimensionDimension(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("5b77ffb6-7658-4f7d-b221-a8f2a8e761be")
    public static final class MdaTypes {
        @objid ("0a459bbe-3300-4c49-a79d-cf20f3767c57")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dfa89359-b59e-4f51-bda6-aee28a3a92c4")
        private static Stereotype MDAASSOCDEP;

        @objid ("94ceaf3b-f08a-4c7b-bb72-b6f0e2882611")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("472fc002-6ab2-48df-a3f5-bcbfe488c1e7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "06cb7c10-7e04-11df-9e39-0014222a9f79");
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
