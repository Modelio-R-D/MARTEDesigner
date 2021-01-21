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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_resolAttr_ClockType_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7d35d022-d8ce-4d88-8c24-9800b5683b30")
public class ProfileAssociationResolAttrClockTypeAttribute {
    @objid ("beeb039f-70ad-4c7d-a395-a671e42b39eb")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_resolAttr_ClockType_Attribute";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("ba79b4a8-3a4c-4484-84ae-9ab2c0010bf0")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationResolAttrClockTypeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_resolAttr_ClockType_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e4efb849-7aca-42ae-a6a4-46bfe5dc5cc9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationResolAttrClockTypeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_resolAttr_ClockType_Attribute >> then instantiate a {@link ProfileAssociationResolAttrClockTypeAttribute} proxy.
     * 
     * @return a {@link ProfileAssociationResolAttrClockTypeAttribute} proxy on the created {@link Dependency}.
     */
    @objid ("b0c57372-aa1e-41b2-b083-01682ba80399")
    public static ProfileAssociationResolAttrClockTypeAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationResolAttrClockTypeAttribute.STEREOTYPE_NAME);
        return ProfileAssociationResolAttrClockTypeAttribute.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationResolAttrClockTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_resolAttr_ClockType_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationResolAttrClockTypeAttribute} proxy or <i>null</i>.
     */
    @objid ("de0b760a-ab54-45de-ac66-86fa3b4a625a")
    public static ProfileAssociationResolAttrClockTypeAttribute instantiate(final Dependency obj) {
        return ProfileAssociationResolAttrClockTypeAttribute.canInstantiate(obj) ? new ProfileAssociationResolAttrClockTypeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationResolAttrClockTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_resolAttr_ClockType_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationResolAttrClockTypeAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("27adb826-1a1b-463e-a940-08433ace8c6e")
    public static ProfileAssociationResolAttrClockTypeAttribute safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationResolAttrClockTypeAttribute.canInstantiate(obj))
        	return new ProfileAssociationResolAttrClockTypeAttribute(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationResolAttrClockTypeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a071808e-12c3-4541-8479-703952bb56b5")
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
        ProfileAssociationResolAttrClockTypeAttribute other = (ProfileAssociationResolAttrClockTypeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("def7fd77-d722-47a0-9a94-57ed8c4abcc5")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("1af63beb-5461-4b5d-8d3a-7d3e7ca62e63")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("df8ab38b-2634-40b6-ae9d-6cd20cf07575")
    protected ProfileAssociationResolAttrClockTypeAttribute(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("24ba4f5a-0b2c-4db4-86f0-2e094aa3aa02")
    public static final class MdaTypes {
        @objid ("c8a3a39c-e0fa-4c1b-a3c1-c87af1a1ba9e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f3de6132-fda7-4118-bb9e-da0cbf6d5167")
        private static Stereotype MDAASSOCDEP;

        @objid ("2c8c0311-cf1f-489e-b8c4-aed89989bdb4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("936bf37b-193c-427d-b0e8-dc1124a5f913")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "be6c3908-82bb-11df-b65a-0014222a9f79");
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
