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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_mode_Configuration_Mode >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8a7badf0-5ad2-49ca-a719-3ae2b0dd4dbd")
public class ProfileAssociationModeConfigurationMode {
    @objid ("ebbc2399-c653-48b2-93b1-661dcce8341d")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_mode_Configuration_Mode";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("efaf5e06-4a8b-487e-ad1a-e09ea19c201e")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationModeConfigurationMode proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_mode_Configuration_Mode >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6a045aa8-e819-47c8-adb1-ea191d0999a9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationModeConfigurationMode.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_mode_Configuration_Mode >> then instantiate a {@link ProfileAssociationModeConfigurationMode} proxy.
     * 
     * @return a {@link ProfileAssociationModeConfigurationMode} proxy on the created {@link Dependency}.
     */
    @objid ("bbfc3eb0-d822-4330-ad97-307929aac23a")
    public static ProfileAssociationModeConfigurationMode create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationModeConfigurationMode.STEREOTYPE_NAME);
        return ProfileAssociationModeConfigurationMode.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationModeConfigurationMode} proxy from a {@link Dependency} stereotyped << ProfileAssociation_mode_Configuration_Mode >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationModeConfigurationMode} proxy or <i>null</i>.
     */
    @objid ("c90d8374-053c-4d93-8eb4-5719046c4b95")
    public static ProfileAssociationModeConfigurationMode instantiate(final Dependency obj) {
        return ProfileAssociationModeConfigurationMode.canInstantiate(obj) ? new ProfileAssociationModeConfigurationMode(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationModeConfigurationMode} proxy from a {@link Dependency} stereotyped << ProfileAssociation_mode_Configuration_Mode >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationModeConfigurationMode} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4c8ad4b4-389e-470f-8f6a-a65c35522b5a")
    public static ProfileAssociationModeConfigurationMode safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationModeConfigurationMode.canInstantiate(obj))
        	return new ProfileAssociationModeConfigurationMode(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationModeConfigurationMode: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("04d94a90-8648-43fd-96cb-3004ed0f2e10")
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
        ProfileAssociationModeConfigurationMode other = (ProfileAssociationModeConfigurationMode) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("8ac96ad8-aba1-4133-b266-bd8822340024")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("6862dc3c-d024-4272-ba0e-f8014447dd83")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("94570842-127f-4837-93bd-d68a65759ce9")
    protected ProfileAssociationModeConfigurationMode(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("03dc1027-f493-40ba-8dcb-317db53cec34")
    public static final class MdaTypes {
        @objid ("338a0785-2bd7-421e-8c52-dd0a6fb98a75")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d8acdd88-2802-4b10-8921-dc4594e70c29")
        private static Stereotype MDAASSOCDEP;

        @objid ("e0fb6987-f15e-40c7-9720-823a4c6f207d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("23baab8c-2512-4679-af74-1c978bc212fa")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "71da080c-91db-11e0-a465-0027103f347c");
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
