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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_offsetAttr_ClockType_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("cf9f14c3-d003-4f85-8977-b646a929f8e8")
public class ProfileAssociationOffsetAttrClockTypeAttribute {
    @objid ("dea1567a-4184-4e9e-b891-adeacb085e73")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_offsetAttr_ClockType_Attribute";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("19437a87-3a3b-495d-9710-e167514b10b3")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationOffsetAttrClockTypeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_offsetAttr_ClockType_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c07574e3-4895-4045-a4de-0d19de88e071")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOffsetAttrClockTypeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_offsetAttr_ClockType_Attribute >> then instantiate a {@link ProfileAssociationOffsetAttrClockTypeAttribute} proxy.
     * 
     * @return a {@link ProfileAssociationOffsetAttrClockTypeAttribute} proxy on the created {@link Dependency}.
     */
    @objid ("25b3ea37-7087-46a7-909f-0c6869e625ff")
    public static ProfileAssociationOffsetAttrClockTypeAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOffsetAttrClockTypeAttribute.STEREOTYPE_NAME);
        return ProfileAssociationOffsetAttrClockTypeAttribute.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOffsetAttrClockTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_offsetAttr_ClockType_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationOffsetAttrClockTypeAttribute} proxy or <i>null</i>.
     */
    @objid ("664a8d47-72fa-4ccc-8a92-2d0c5b634cb2")
    public static ProfileAssociationOffsetAttrClockTypeAttribute instantiate(final Dependency obj) {
        return ProfileAssociationOffsetAttrClockTypeAttribute.canInstantiate(obj) ? new ProfileAssociationOffsetAttrClockTypeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOffsetAttrClockTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_offsetAttr_ClockType_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationOffsetAttrClockTypeAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b27ddf68-9e91-468f-a816-70c38c6b908f")
    public static ProfileAssociationOffsetAttrClockTypeAttribute safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationOffsetAttrClockTypeAttribute.canInstantiate(obj))
        	return new ProfileAssociationOffsetAttrClockTypeAttribute(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationOffsetAttrClockTypeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8e0801e4-8f4f-4e76-b790-8e5d9b2f7dbb")
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
        ProfileAssociationOffsetAttrClockTypeAttribute other = (ProfileAssociationOffsetAttrClockTypeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("6e148c7f-bca1-4f64-b6b0-9ddb2c5ae79b")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("4d46d42e-f2e8-4e59-939d-90728fe6c1fe")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f001f8ef-0135-4fa2-82b8-7a9211f7e514")
    protected ProfileAssociationOffsetAttrClockTypeAttribute(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("08126326-6379-406c-b3bb-304cd1e37634")
    public static final class MdaTypes {
        @objid ("963f0b43-654b-4350-9136-4c0803710701")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("67e2d6b1-7d81-4465-be1e-12ae9eb27633")
        private static Stereotype MDAASSOCDEP;

        @objid ("3e296e1a-a01c-4dc4-9a7b-e59887e5090a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d5a7f1a6-dd05-4416-a5aa-4c719d50a063")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ad3181de-82bb-11df-b65a-0014222a9f79");
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
