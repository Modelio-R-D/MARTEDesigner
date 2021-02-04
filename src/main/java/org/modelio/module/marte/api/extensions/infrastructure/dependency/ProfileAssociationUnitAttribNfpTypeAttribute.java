/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("f53b6e3a-8cf4-47df-bc5b-74a87f09d4d4")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_unitAttrib_NfpType_Attribute";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("677d9a65-db34-4650-8179-5407f49005b5")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationUnitAttribNfpTypeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_unitAttrib_NfpType_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fbdb13fe-dd88-4a34-bf8c-d93d675b4cfb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationUnitAttribNfpTypeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_unitAttrib_NfpType_Attribute >> then instantiate a {@link ProfileAssociationUnitAttribNfpTypeAttribute} proxy.
     * 
     * @return a {@link ProfileAssociationUnitAttribNfpTypeAttribute} proxy on the created {@link Dependency}.
     */
    @objid ("70ddaa41-0f1c-4fc4-9066-135cba797c06")
    public static ProfileAssociationUnitAttribNfpTypeAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationUnitAttribNfpTypeAttribute.STEREOTYPE_NAME);
        return ProfileAssociationUnitAttribNfpTypeAttribute.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationUnitAttribNfpTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_unitAttrib_NfpType_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationUnitAttribNfpTypeAttribute} proxy or <i>null</i>.
     */
    @objid ("2426ac1f-16ed-4ef7-8b03-2a8f7bc53744")
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
    @objid ("dc92d264-6e05-4c14-b94b-c0d7fb7692c7")
    public static ProfileAssociationUnitAttribNfpTypeAttribute safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationUnitAttribNfpTypeAttribute.canInstantiate(obj))
        	return new ProfileAssociationUnitAttribNfpTypeAttribute(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationUnitAttribNfpTypeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8ba02d2f-efe9-4e0e-908b-55e115cf68cf")
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
    @objid ("8743cf72-fb79-40f4-ab07-16fe0eeb0bd9")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("48236ce4-ac0c-4aa9-a271-24f2efe54175")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2025c1ff-deb1-4978-a50e-9001cf8f5d3e")
    protected ProfileAssociationUnitAttribNfpTypeAttribute(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("bbe84f4d-3397-4cca-8a37-d378dccdb156")
    public static final class MdaTypes {
        @objid ("4671ce52-900f-4ef1-b34c-1cf3898f64bf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cb6cc894-5314-420d-a9d7-84fcd09507d8")
        private static Stereotype MDAASSOCDEP;

        @objid ("fd314e30-c65c-4b63-8c27-ac6c325b570c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ef220cf0-9675-458c-93f1-80ffbc075085")
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
