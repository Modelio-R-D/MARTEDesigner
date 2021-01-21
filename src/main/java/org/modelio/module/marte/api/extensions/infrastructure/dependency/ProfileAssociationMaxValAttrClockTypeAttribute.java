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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_maxValAttr_ClockType_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c433a42f-6b10-4571-b9e2-1868b3108f5d")
public class ProfileAssociationMaxValAttrClockTypeAttribute {
    @objid ("2e3ba9d6-dd8e-4777-bf35-197c5dcdd595")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_maxValAttr_ClockType_Attribute";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("30828910-151d-411f-a0f8-01776ea7bd9c")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMaxValAttrClockTypeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_maxValAttr_ClockType_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("47620e3f-b980-4041-8f42-4235dc87770e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMaxValAttrClockTypeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_maxValAttr_ClockType_Attribute >> then instantiate a {@link ProfileAssociationMaxValAttrClockTypeAttribute} proxy.
     * 
     * @return a {@link ProfileAssociationMaxValAttrClockTypeAttribute} proxy on the created {@link Dependency}.
     */
    @objid ("b4b10e7f-1a87-49e6-845c-f7be8fcdc68a")
    public static ProfileAssociationMaxValAttrClockTypeAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMaxValAttrClockTypeAttribute.STEREOTYPE_NAME);
        return ProfileAssociationMaxValAttrClockTypeAttribute.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMaxValAttrClockTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_maxValAttr_ClockType_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMaxValAttrClockTypeAttribute} proxy or <i>null</i>.
     */
    @objid ("4996a6a3-c350-40f0-8827-2ee72f4de499")
    public static ProfileAssociationMaxValAttrClockTypeAttribute instantiate(final Dependency obj) {
        return ProfileAssociationMaxValAttrClockTypeAttribute.canInstantiate(obj) ? new ProfileAssociationMaxValAttrClockTypeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMaxValAttrClockTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_maxValAttr_ClockType_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationMaxValAttrClockTypeAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("376457a0-7598-46e0-886e-b1e3b4cacafd")
    public static ProfileAssociationMaxValAttrClockTypeAttribute safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMaxValAttrClockTypeAttribute.canInstantiate(obj))
        	return new ProfileAssociationMaxValAttrClockTypeAttribute(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMaxValAttrClockTypeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("21b5e54f-9574-4acf-ae63-1c3a0bfe30b0")
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
        ProfileAssociationMaxValAttrClockTypeAttribute other = (ProfileAssociationMaxValAttrClockTypeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("c9507b98-6c2c-4ece-9d6b-429ef200d208")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("57d72e04-bdc0-413d-82d2-757f71a8bf61")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3f021211-25bd-4425-89ae-e152d6ab90b7")
    protected ProfileAssociationMaxValAttrClockTypeAttribute(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("45bd2e85-c5e9-444b-b421-049d64be8110")
    public static final class MdaTypes {
        @objid ("93c8c2e0-1d1f-45ef-b5cb-2583d2f42e62")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a5f5846d-f675-4dc1-8b23-14f11adbcb51")
        private static Stereotype MDAASSOCDEP;

        @objid ("747d57b3-aa46-40a8-9b22-5497a542eda4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fccebc7c-9e34-4e69-a242-91f804f08eeb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "911614a4-82bb-11df-b65a-0014222a9f79");
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
