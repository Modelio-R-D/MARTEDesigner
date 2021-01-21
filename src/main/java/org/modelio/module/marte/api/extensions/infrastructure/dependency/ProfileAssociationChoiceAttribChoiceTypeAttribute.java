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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_choiceAttrib_ChoiceType_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("87d6cd96-c4bd-4dd4-87a1-dcfb738d576e")
public class ProfileAssociationChoiceAttribChoiceTypeAttribute {
    @objid ("6c999b63-c5de-4c5e-b502-cca9d0f35577")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_choiceAttrib_ChoiceType_Attribute";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("8312681c-d439-4a59-96c4-3320b54eb2ad")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationChoiceAttribChoiceTypeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_choiceAttrib_ChoiceType_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("15e91b7f-281a-4e04-b0a5-bc1332951fb5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationChoiceAttribChoiceTypeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_choiceAttrib_ChoiceType_Attribute >> then instantiate a {@link ProfileAssociationChoiceAttribChoiceTypeAttribute} proxy.
     * 
     * @return a {@link ProfileAssociationChoiceAttribChoiceTypeAttribute} proxy on the created {@link Dependency}.
     */
    @objid ("a9d0354e-cdcf-4ef1-965a-ed4fc87ab3b7")
    public static ProfileAssociationChoiceAttribChoiceTypeAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationChoiceAttribChoiceTypeAttribute.STEREOTYPE_NAME);
        return ProfileAssociationChoiceAttribChoiceTypeAttribute.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationChoiceAttribChoiceTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_choiceAttrib_ChoiceType_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationChoiceAttribChoiceTypeAttribute} proxy or <i>null</i>.
     */
    @objid ("4e8ccc25-4df9-4b76-a5eb-495d5c1b5abd")
    public static ProfileAssociationChoiceAttribChoiceTypeAttribute instantiate(final Dependency obj) {
        return ProfileAssociationChoiceAttribChoiceTypeAttribute.canInstantiate(obj) ? new ProfileAssociationChoiceAttribChoiceTypeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationChoiceAttribChoiceTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_choiceAttrib_ChoiceType_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationChoiceAttribChoiceTypeAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b5e61172-9300-4e9a-9eb2-6e22e10ca403")
    public static ProfileAssociationChoiceAttribChoiceTypeAttribute safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationChoiceAttribChoiceTypeAttribute.canInstantiate(obj))
        	return new ProfileAssociationChoiceAttribChoiceTypeAttribute(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationChoiceAttribChoiceTypeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("962cd3e2-85d6-4735-9540-46c58fc6a526")
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
        ProfileAssociationChoiceAttribChoiceTypeAttribute other = (ProfileAssociationChoiceAttribChoiceTypeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("335b351d-497c-4f9f-a67d-49a2bd3d7e58")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("fb05ac37-d9b8-4a45-80c5-6aac29ca4180")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6f4bb390-7ba1-4143-998b-5a6af66da235")
    protected ProfileAssociationChoiceAttribChoiceTypeAttribute(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("73742a79-b6a5-4571-8b7a-807ac0387743")
    public static final class MdaTypes {
        @objid ("ed34bf96-20f4-4dad-945a-9008feb5e2e3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e451e9b5-23a4-4bdc-8fdb-8002ce00f588")
        private static Stereotype MDAASSOCDEP;

        @objid ("1a53ccf6-e96d-4df9-8da9-457da0e0b600")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("de51d06d-e215-4005-8c49-8d4fd7b2bac2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fb2c03b0-82b2-11df-b65a-0014222a9f79");
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
