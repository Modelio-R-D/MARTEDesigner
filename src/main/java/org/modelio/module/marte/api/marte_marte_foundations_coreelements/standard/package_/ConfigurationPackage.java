/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << Configuration_Package >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("52576069-91f1-4462-924e-4dae34d2b262")
public class ConfigurationPackage {
    @objid ("f15cb8bd-b1e5-4524-b17c-fb7d04478b07")
    public static final String STEREOTYPE_NAME = "Configuration_Package";

    @objid ("0ecf774f-81fa-4e7f-aea8-27799317b073")
    public static final String CONFIGURATION_PACKAGE_MODE_TAGTYPE = "Configuration_Package_mode";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    @objid ("d2741507-acd5-4936-a535-a718083a8e9a")
    protected final Package elt;

    /**
     * Tells whether a {@link ConfigurationPackage proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << Configuration_Package >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e9e475c2-21cb-4af5-8bea-6c54ba75b361")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ConfigurationPackage.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << Configuration_Package >> then instantiate a {@link ConfigurationPackage} proxy.
     * 
     * @return a {@link ConfigurationPackage} proxy on the created {@link Package}.
     */
    @objid ("dfd8cff3-273b-4209-af78-cf594f552371")
    public static ConfigurationPackage create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Package");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ConfigurationPackage.STEREOTYPE_NAME);
        return ConfigurationPackage.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link ConfigurationPackage} proxy from a {@link Package} stereotyped << Configuration_Package >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link ConfigurationPackage} proxy or <i>null</i>.
     */
    @objid ("25d093bc-1633-4961-964d-eff8533fdaca")
    public static ConfigurationPackage instantiate(final Package obj) {
        return ConfigurationPackage.canInstantiate(obj) ? new ConfigurationPackage(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConfigurationPackage} proxy from a {@link Package} stereotyped << Configuration_Package >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link ConfigurationPackage} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7237268f-01fe-4c68-9675-a0ced4ead8cf")
    public static ConfigurationPackage safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (ConfigurationPackage.canInstantiate(obj))
        	return new ConfigurationPackage(obj);
        else
        	throw new IllegalArgumentException("ConfigurationPackage: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0c1fc8b7-fe69-417b-8221-9bed4e18dce1")
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
        ConfigurationPackage other = (ConfigurationPackage) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'Configuration_Package_mode'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5406b613-0678-4daf-914f-c2bc4eebd0c9")
    public List<String> getConfiguration_Package_mode() {
        return this.elt.getTagValues(ConfigurationPackage.MdaTypes.CONFIGURATION_PACKAGE_MODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("d254f904-c0f7-4a2c-8a31-399760ecb8a5")
    public Package getElement() {
        return this.elt;
    }

    @objid ("3526c1d4-f5ee-4872-a197-6ce3a360225f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'Configuration_Package_mode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5fcf4214-db7f-4386-a8ee-4fcd9dc91685")
    public void setConfiguration_Package_mode(final List<String> values) {
        this.elt.putTagValues(ConfigurationPackage.MdaTypes.CONFIGURATION_PACKAGE_MODE_TAGTYPE_ELT, values);
    }

    @objid ("d0c2d6c6-dc60-4917-b8aa-f3c661ad6173")
    protected ConfigurationPackage(final Package elt) {
        this.elt = elt;
    }

    @objid ("992a3bf1-982f-4440-b0b4-d088f3b9b776")
    public static final class MdaTypes {
        @objid ("27b7c4f0-d261-46b2-aadb-72dba123373f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("149fc22d-9ad0-4482-8b6b-6092a9e64c75")
        public static TagType CONFIGURATION_PACKAGE_MODE_TAGTYPE_ELT;

        @objid ("04aad181-74f4-4276-8329-a5c6376154ae")
        private static Stereotype MDAASSOCDEP;

        @objid ("25ca9a72-1026-47c0-827a-c8d88fe5d258")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c675efd0-da28-4139-a736-cb72794b8649")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00c30c41-0ccf-11df-8525-001302895b2b");
            CONFIGURATION_PACKAGE_MODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00c30c43-0ccf-11df-8525-001302895b2b");
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
