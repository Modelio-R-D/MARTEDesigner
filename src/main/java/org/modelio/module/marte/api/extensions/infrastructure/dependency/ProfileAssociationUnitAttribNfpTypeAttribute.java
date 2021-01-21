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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_unitAttrib_NfpType_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ac89e006-b29f-4468-849e-70288a2c0aa8")
public class ProfileAssociationUnitAttribNfpTypeAttribute {
    @objid ("df8ec994-0f5e-474c-87fa-957a587e6a2e")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_unitAttrib_NfpType_Attribute";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("41eec030-3317-47c7-9f4e-1a1985cc85cb")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationUnitAttribNfpTypeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_unitAttrib_NfpType_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b6f4316c-1c12-422b-977e-ba4a1b0d9ecb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationUnitAttribNfpTypeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_unitAttrib_NfpType_Attribute >> then instantiate a {@link ProfileAssociationUnitAttribNfpTypeAttribute} proxy.
     * 
     * @return a {@link ProfileAssociationUnitAttribNfpTypeAttribute} proxy on the created {@link Dependency}.
     */
    @objid ("44c7ee6e-7c3b-4a62-bff8-3c5f2254b224")
    public static ProfileAssociationUnitAttribNfpTypeAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationUnitAttribNfpTypeAttribute.STEREOTYPE_NAME);
        return ProfileAssociationUnitAttribNfpTypeAttribute.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationUnitAttribNfpTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_unitAttrib_NfpType_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationUnitAttribNfpTypeAttribute} proxy or <i>null</i>.
     */
    @objid ("91ec8c36-a55b-4736-997e-14168ae46020")
    public static ProfileAssociationUnitAttribNfpTypeAttribute instantiate(final Dependency obj) {
        return ProfileAssociationUnitAttribNfpTypeAttribute.canInstantiate(obj) ? new ProfileAssociationUnitAttribNfpTypeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationUnitAttribNfpTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_unitAttrib_NfpType_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationUnitAttribNfpTypeAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5aa4ff18-ed52-4c5d-8855-d2794a683be8")
    public static ProfileAssociationUnitAttribNfpTypeAttribute safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationUnitAttribNfpTypeAttribute.canInstantiate(obj))
        	return new ProfileAssociationUnitAttribNfpTypeAttribute(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationUnitAttribNfpTypeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("082544ba-8579-41f0-abc2-93d06c9ce731")
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
        ProfileAssociationUnitAttribNfpTypeAttribute other = (ProfileAssociationUnitAttribNfpTypeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("fdc66507-5529-45b2-b24d-269083aec19a")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("c8721c9d-a063-42c4-a8aa-4bd058e7ace5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9b5c686c-5e8f-4918-972e-7f68e86f69a9")
    protected ProfileAssociationUnitAttribNfpTypeAttribute(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("bbe84f4d-3397-4cca-8a37-d378dccdb156")
    public static final class MdaTypes {
        @objid ("a0adaaf7-fb26-4a17-b0f0-1f0c25255f1b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8ee336a7-6d19-4bf3-942f-d912e49b0853")
        private static Stereotype MDAASSOCDEP;

        @objid ("fff68af8-e0be-4278-ac88-b37a76cedf24")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("44900ff4-d9de-467c-b8d2-db1874874518")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "92052947-7e0c-11df-9e39-0014222a9f79");
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
