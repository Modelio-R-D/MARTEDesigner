/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwMedia_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e3dcad9a-5770-4ea5-b338-e115ec9db948")
public class HwMediaInstance extends HwCommunicationResourceInstance {
    @objid ("cf67a71b-db1c-49f2-bf9a-68edc8021e44")
    public static final String STEREOTYPE_NAME = "HwMedia_Instance";

    @objid ("3ed16ea2-f757-446f-8856-d0a2bfe66bcd")
    public static final String HWMEDIA_INSTANCE_ARBITERS_TAGTYPE = "HwMedia_Instance_arbiters";

    @objid ("43455b34-ba41-481d-85be-ce91d7c62539")
    public static final String HWMEDIA_INSTANCE_BANDWIDTH_TAGTYPE = "HwMedia_Instance_bandwidth";

    /**
     * Tells whether a {@link HwMediaInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwMedia_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("560b7cb5-7439-4f69-9933-cfc8040310bc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwMedia_Instance >> then instantiate a {@link HwMediaInstance} proxy.
     * 
     * @return a {@link HwMediaInstance} proxy on the created {@link Instance}.
     */
    @objid ("a44df41a-de26-4838-8786-d59ba5756a9f")
    public static HwMediaInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaInstance.STEREOTYPE_NAME);
        return HwMediaInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwMediaInstance} proxy from a {@link Instance} stereotyped << HwMedia_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwMediaInstance} proxy or <i>null</i>.
     */
    @objid ("ad971938-0ebd-4937-8267-b859b80b1bbe")
    public static HwMediaInstance instantiate(final Instance obj) {
        return HwMediaInstance.canInstantiate(obj) ? new HwMediaInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMediaInstance} proxy from a {@link Instance} stereotyped << HwMedia_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwMediaInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f58b8b4a-8c74-44ca-b6ac-4eaf8cef9a3b")
    public static HwMediaInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwMediaInstance.canInstantiate(obj))
        	return new HwMediaInstance(obj);
        else
        	throw new IllegalArgumentException("HwMediaInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f6be0498-7f5b-4472-b985-674f7e6d2dd9")
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
        HwMediaInstance other = (HwMediaInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("1de615f5-b014-4116-afcc-8c08132e7ff0")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwMedia_Instance_arbiters'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("64775ca0-157d-4649-b94f-759956fa2d9c")
    public List<String> getHwMedia_Instance_arbiters() {
        return this.elt.getTagValues(HwMediaInstance.MdaTypes.HWMEDIA_INSTANCE_ARBITERS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMedia_Instance_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5539678b-5504-4875-9e53-6dc48ce3c69a")
    public String getHwMedia_Instance_bandwidth() {
        return this.elt.getTagValue(HwMediaInstance.MdaTypes.HWMEDIA_INSTANCE_BANDWIDTH_TAGTYPE_ELT);
    }

    @objid ("818b641c-f90e-4ee2-8788-d69f7bb18a10")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwMedia_Instance_arbiters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2c810e08-b31b-4ab4-971c-88f587eaff59")
    public void setHwMedia_Instance_arbiters(final List<String> values) {
        this.elt.putTagValues(HwMediaInstance.MdaTypes.HWMEDIA_INSTANCE_ARBITERS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMedia_Instance_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("46920eeb-1961-4321-b4db-f215926fe112")
    public void setHwMedia_Instance_bandwidth(final String value) {
        this.elt.putTagValue(HwMediaInstance.MdaTypes.HWMEDIA_INSTANCE_BANDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("51946f81-af67-43ca-a816-96c20c465138")
    protected HwMediaInstance(final Instance elt) {
        super(elt);
    }

    @objid ("3a5b6b79-9e98-4f6c-833a-50a18c58b581")
    public static final class MdaTypes {
        @objid ("c425df0a-e13c-4da1-af19-f118f8bc7b64")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fd018987-a424-4fe3-9adb-346f9ffe39a4")
        public static TagType HWMEDIA_INSTANCE_ARBITERS_TAGTYPE_ELT;

        @objid ("c7f2de0c-2bff-4ffc-b9e2-dfbec0238941")
        public static TagType HWMEDIA_INSTANCE_BANDWIDTH_TAGTYPE_ELT;

        @objid ("13baadf0-a6b1-4e30-bf1c-db3fb3a7d981")
        private static Stereotype MDAASSOCDEP;

        @objid ("196b07f5-dfd2-4870-a83a-1dc8ab115674")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e8ce3c89-48b3-4372-9cce-0d12d66e1bed")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0105cd3d-0ccf-11df-8525-001302895b2b");
            HWMEDIA_INSTANCE_ARBITERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "095748dc-1727-11df-b92a-0014222a9f79");
            HWMEDIA_INSTANCE_BANDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a7564357-5d9c-11df-9e91-0014222a9f79");
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
