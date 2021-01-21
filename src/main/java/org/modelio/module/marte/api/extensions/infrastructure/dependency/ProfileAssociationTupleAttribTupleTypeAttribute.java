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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_tupleAttrib_TupleType_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9fb3b730-3576-46b8-bd9f-b475b7cfb976")
public class ProfileAssociationTupleAttribTupleTypeAttribute {
    @objid ("b1a3f058-f478-45a7-88ca-9c3d1cead876")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_tupleAttrib_TupleType_Attribute";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("9341817b-ebf1-49ba-bd69-b7c27b3b2409")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationTupleAttribTupleTypeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_tupleAttrib_TupleType_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7c71649e-8a73-4e66-a32f-9335b11ac8da")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationTupleAttribTupleTypeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_tupleAttrib_TupleType_Attribute >> then instantiate a {@link ProfileAssociationTupleAttribTupleTypeAttribute} proxy.
     * 
     * @return a {@link ProfileAssociationTupleAttribTupleTypeAttribute} proxy on the created {@link Dependency}.
     */
    @objid ("17024ee7-156d-430c-bca4-d577e896e18e")
    public static ProfileAssociationTupleAttribTupleTypeAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationTupleAttribTupleTypeAttribute.STEREOTYPE_NAME);
        return ProfileAssociationTupleAttribTupleTypeAttribute.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationTupleAttribTupleTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_tupleAttrib_TupleType_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationTupleAttribTupleTypeAttribute} proxy or <i>null</i>.
     */
    @objid ("6aacaf9d-4f36-49e8-a0b2-c7f94e67fb74")
    public static ProfileAssociationTupleAttribTupleTypeAttribute instantiate(final Dependency obj) {
        return ProfileAssociationTupleAttribTupleTypeAttribute.canInstantiate(obj) ? new ProfileAssociationTupleAttribTupleTypeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationTupleAttribTupleTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_tupleAttrib_TupleType_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationTupleAttribTupleTypeAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b3d6fe96-1734-41e3-abfa-fefd6ace3e79")
    public static ProfileAssociationTupleAttribTupleTypeAttribute safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationTupleAttribTupleTypeAttribute.canInstantiate(obj))
        	return new ProfileAssociationTupleAttribTupleTypeAttribute(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationTupleAttribTupleTypeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d0920fb3-b787-4fb7-9739-5d1c43e8195d")
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
        ProfileAssociationTupleAttribTupleTypeAttribute other = (ProfileAssociationTupleAttribTupleTypeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("e4b255b1-e175-4ea9-bf04-9ba7c00d0681")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("a68ea81d-e898-46a4-b19c-b459ffed755d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("86897bdc-059b-4f84-8bd1-64ceedb229df")
    protected ProfileAssociationTupleAttribTupleTypeAttribute(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("4fffc668-58a4-40a7-830d-d99570b30ccf")
    public static final class MdaTypes {
        @objid ("53200533-7cf0-45bd-b2f1-bb8435d692b9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2dacee8d-7eb6-4bea-99f7-e57c8fbfa66e")
        private static Stereotype MDAASSOCDEP;

        @objid ("6629e17d-fdc1-412a-9854-4c25a68d734f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b275cb9f-2737-49fd-ac69-3eb8dbf31875")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a763080a-7e08-11df-9e39-0014222a9f79");
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
