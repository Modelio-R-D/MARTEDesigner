/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << DeviceResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ea238a3e-4712-43fe-b833-b10adb967d60")
public class DeviceResourceAssociation extends ProcessingResourceAssociation {
    @objid ("f9bc5757-4b69-409e-ad19-96205167c98b")
    public static final String STEREOTYPE_NAME = "DeviceResource_Association";

    /**
     * Tells whether a {@link DeviceResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << DeviceResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6c92721c-851e-4eaf-8dd6-617ac484a2cc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << DeviceResource_Association >> then instantiate a {@link DeviceResourceAssociation} proxy.
     * 
     * @return a {@link DeviceResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("8f661b64-a2cb-420a-aae1-326719a99f09")
    public static DeviceResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceAssociation.STEREOTYPE_NAME);
        return DeviceResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link DeviceResourceAssociation} proxy from a {@link Association} stereotyped << DeviceResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link DeviceResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("953a14f8-18c5-4e28-b180-6ec320ea0d45")
    public static DeviceResourceAssociation instantiate(final Association obj) {
        return DeviceResourceAssociation.canInstantiate(obj) ? new DeviceResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeviceResourceAssociation} proxy from a {@link Association} stereotyped << DeviceResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link DeviceResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4252ae07-363f-4923-a780-7efc98c83f24")
    public static DeviceResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (DeviceResourceAssociation.canInstantiate(obj))
        	return new DeviceResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("DeviceResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("14c6f2f4-3a81-4135-910a-e0ebd23fd399")
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
        DeviceResourceAssociation other = (DeviceResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("77ddec87-271d-487a-ba5b-8bdf6ab509d2")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("0f603b23-7369-41c1-9137-51948970d34b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("7bc0e876-f30c-4e0a-9e9c-9e8c56805590")
    protected DeviceResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("b92bb351-4f87-4d6d-8ce0-cbab319a1de1")
    public static final class MdaTypes {
        @objid ("0926a42f-7352-4051-8c92-6dc03003d210")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5e1c6d5d-c2cf-467c-b804-f712687cabc3")
        private static Stereotype MDAASSOCDEP;

        @objid ("56120672-b7e9-4be7-9b56-ce28eae45f99")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b3a9a56c-3fa9-40ae-9fd8-1d5f46307c59")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5af4dccd-1571-11df-947b-001302895b2b");
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
