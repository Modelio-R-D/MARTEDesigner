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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_baseType_BoundedSubType_Datatype >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7d6e2fbc-06e3-46f8-ab43-58981625d93c")
public class ProfileAssociationBaseTypeBoundedSubTypeDatatype {
    @objid ("7d4afe89-3608-4fb0-9268-ec270392d113")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_baseType_BoundedSubType_Datatype";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("6f02d954-f21e-44a4-8d1d-b6b038ef8c1b")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationBaseTypeBoundedSubTypeDatatype proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_baseType_BoundedSubType_Datatype >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0969c645-0674-49d8-99fa-881d4a6ef507")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBaseTypeBoundedSubTypeDatatype.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_baseType_BoundedSubType_Datatype >> then instantiate a {@link ProfileAssociationBaseTypeBoundedSubTypeDatatype} proxy.
     * 
     * @return a {@link ProfileAssociationBaseTypeBoundedSubTypeDatatype} proxy on the created {@link Dependency}.
     */
    @objid ("21a1cf63-e943-4893-8860-a1b08d9414a9")
    public static ProfileAssociationBaseTypeBoundedSubTypeDatatype create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBaseTypeBoundedSubTypeDatatype.STEREOTYPE_NAME);
        return ProfileAssociationBaseTypeBoundedSubTypeDatatype.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBaseTypeBoundedSubTypeDatatype} proxy from a {@link Dependency} stereotyped << ProfileAssociation_baseType_BoundedSubType_Datatype >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationBaseTypeBoundedSubTypeDatatype} proxy or <i>null</i>.
     */
    @objid ("51713a23-03a8-4633-9492-3bb0aada6eb9")
    public static ProfileAssociationBaseTypeBoundedSubTypeDatatype instantiate(final Dependency obj) {
        return ProfileAssociationBaseTypeBoundedSubTypeDatatype.canInstantiate(obj) ? new ProfileAssociationBaseTypeBoundedSubTypeDatatype(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBaseTypeBoundedSubTypeDatatype} proxy from a {@link Dependency} stereotyped << ProfileAssociation_baseType_BoundedSubType_Datatype >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationBaseTypeBoundedSubTypeDatatype} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b2333b44-3457-435c-b68a-9be62050f5e4")
    public static ProfileAssociationBaseTypeBoundedSubTypeDatatype safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationBaseTypeBoundedSubTypeDatatype.canInstantiate(obj))
        	return new ProfileAssociationBaseTypeBoundedSubTypeDatatype(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationBaseTypeBoundedSubTypeDatatype: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bcf45068-0915-490e-903a-b141255b407f")
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
        ProfileAssociationBaseTypeBoundedSubTypeDatatype other = (ProfileAssociationBaseTypeBoundedSubTypeDatatype) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("1fe0277b-6b2a-4c5d-a38e-f4a688ab740a")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("e2c0626b-e473-4d81-8d55-50b7bbd0a575")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("4cbe3dc4-b531-4130-bc9b-1887e908f657")
    protected ProfileAssociationBaseTypeBoundedSubTypeDatatype(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("93dbef1c-aa72-417f-9008-c5fb92f8b842")
    public static final class MdaTypes {
        @objid ("273d03e7-c47d-4ab0-b99f-04db02564d5e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b8773d64-66c3-434e-8963-a8f32acd440d")
        private static Stereotype MDAASSOCDEP;

        @objid ("613fbc77-7980-46c8-bf9d-e3a5468ccf0b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4a7476a8-68ea-4044-abfd-1daca5c1646f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "57f5288e-82b2-11df-b65a-0014222a9f79");
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
