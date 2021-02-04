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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_mode_Configuration_Mode >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8a7badf0-5ad2-49ca-a719-3ae2b0dd4dbd")
public class ProfileAssociationModeConfigurationMode {
    @objid ("4c46ff29-750f-423b-bc96-26ffa038e2ec")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_mode_Configuration_Mode";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("88323dd5-96da-4c05-b359-b0986fce6b71")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationModeConfigurationMode proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_mode_Configuration_Mode >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cd10f96e-568c-4086-a34f-f9eb99005efc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationModeConfigurationMode.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_mode_Configuration_Mode >> then instantiate a {@link ProfileAssociationModeConfigurationMode} proxy.
     * 
     * @return a {@link ProfileAssociationModeConfigurationMode} proxy on the created {@link Dependency}.
     */
    @objid ("9464137a-3480-4952-85a2-3c3ab30b4c29")
    public static ProfileAssociationModeConfigurationMode create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationModeConfigurationMode.STEREOTYPE_NAME);
        return ProfileAssociationModeConfigurationMode.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationModeConfigurationMode} proxy from a {@link Dependency} stereotyped << ProfileAssociation_mode_Configuration_Mode >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationModeConfigurationMode} proxy or <i>null</i>.
     */
    @objid ("fd52a578-cf70-462e-a4fe-5760bf15d2ca")
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
    @objid ("673bb63a-0211-4386-8a5c-d38b79cfbe2b")
    public static ProfileAssociationModeConfigurationMode safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationModeConfigurationMode.canInstantiate(obj))
        	return new ProfileAssociationModeConfigurationMode(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationModeConfigurationMode: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("913fe4b3-f2f1-41e4-86b8-dbd4b4364c33")
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
    @objid ("962dd521-96b8-4bcd-967e-46131293704c")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("5639a8e8-70a8-4fbf-b22e-8e7f845aedbc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ba409998-99ee-4bae-bea9-48ae55e8e5d2")
    protected ProfileAssociationModeConfigurationMode(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("03dc1027-f493-40ba-8dcb-317db53cec34")
    public static final class MdaTypes {
        @objid ("207bd337-7da9-424a-bf13-c8a5651836c3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("99bbaf07-5fbf-44ee-884b-5414b8923ef6")
        private static Stereotype MDAASSOCDEP;

        @objid ("98ad1e16-625e-4b69-b314-65a235b60228")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0e9b54db-5d9e-4077-b930-0b600407fdd1")
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
