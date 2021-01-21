/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.instance;

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
 * Proxy class to handle a {@link Instance} with << SwResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("86ca54df-207c-48c0-9cae-902495009a20")
public class SwResourceInstance {
    @objid ("322e6856-f1b9-48c4-be14-fcc8235b7382")
    public static final String STEREOTYPE_NAME = "SwResource_Instance";

    @objid ("8f9ceb96-c5aa-4c64-ae1c-bebd58a7fae0")
    public static final String SWRESOURCE_INSTANCE_CREATESERVICES_TAGTYPE = "SwResource_Instance_createServices";

    @objid ("c8db5dc9-66a5-4ec7-9f75-cf2db7d562d9")
    public static final String SWRESOURCE_INSTANCE_DELETESERVICES_TAGTYPE = "SwResource_Instance_deleteServices";

    @objid ("2521f3a8-9ef9-4e44-8886-ba1c6e118265")
    public static final String SWRESOURCE_INSTANCE_IDENTIFIERELEMENTS_TAGTYPE = "SwResource_Instance_identifierElements";

    @objid ("e19de151-dd4e-4e78-81c9-9e7819d4dbc1")
    public static final String SWRESOURCE_INSTANCE_INITIALIZESERVICES_TAGTYPE = "SwResource_Instance_initializeServices";

    @objid ("f37a2b45-b5e8-402e-af80-542820fbcb2f")
    public static final String SWRESOURCE_INSTANCE_MEMORYSIZEFOOTPRINT_TAGTYPE = "SwResource_Instance_memorySizeFootprint";

    @objid ("530afbeb-dd08-4f87-9108-d440e40099db")
    public static final String SWRESOURCE_INSTANCE_STATEELEMENTS_TAGTYPE = "SwResource_Instance_stateElements";

    /**
     * The underlying {@link Instance} represented by this proxy, never null.
     */
    @objid ("8b28547e-3ec3-4785-be24-30c8ce45afe3")
    protected final Instance elt;

    /**
     * Tells whether a {@link SwResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SwResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7049cb4c-bd41-4222-99a2-99c0ab7268ae")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SwResource_Instance >> then instantiate a {@link SwResourceInstance} proxy.
     * 
     * @return a {@link SwResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("b2101f67-a19a-443b-a37a-e32bcfe076ec")
    public static SwResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceInstance.STEREOTYPE_NAME);
        return SwResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SwResourceInstance} proxy from a {@link Instance} stereotyped << SwResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SwResourceInstance} proxy or <i>null</i>.
     */
    @objid ("891e50d5-4a69-4cab-9395-f9603d8b96ef")
    public static SwResourceInstance instantiate(final Instance obj) {
        return SwResourceInstance.canInstantiate(obj) ? new SwResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwResourceInstance} proxy from a {@link Instance} stereotyped << SwResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SwResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d21e69a7-897d-4f77-85e6-23a9c12b2f08")
    public static SwResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SwResourceInstance.canInstantiate(obj))
        	return new SwResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SwResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a8a9234a-2fc7-4aa8-b50e-c7abaa948cd2")
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
        SwResourceInstance other = (SwResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("b2c8fed6-a113-4960-9e5b-fc2fd2bb64e8")
    public Instance getElement() {
        return this.elt;
    }

    /**
     * Getter for List<String> property 'SwResource_Instance_createServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d38f1e50-3d65-466c-95c9-d5ce0c77e979")
    public List<String> getSwResource_Instance_createServices() {
        return this.elt.getTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_CREATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Instance_deleteServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b9677bd5-81f2-491a-b70b-c901be19046c")
    public List<String> getSwResource_Instance_deleteServices() {
        return this.elt.getTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_DELETESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Instance_identifierElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("eb39a1a1-eb0c-4422-813d-934a61e80839")
    public List<String> getSwResource_Instance_identifierElements() {
        return this.elt.getTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_IDENTIFIERELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Instance_initializeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("40545b66-a642-4cdc-aa2c-3d0a3e379cbd")
    public List<String> getSwResource_Instance_initializeServices() {
        return this.elt.getTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_INITIALIZESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwResource_Instance_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bc58803d-8c9b-4cbe-84fc-b93507d972ba")
    public String getSwResource_Instance_memorySizeFootprint() {
        return this.elt.getTagValue(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Instance_stateElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4957f82a-d2a3-4b7a-a1db-a57006daa34b")
    public List<String> getSwResource_Instance_stateElements() {
        return this.elt.getTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_STATEELEMENTS_TAGTYPE_ELT);
    }

    @objid ("0b28b1f1-3ea9-4bdd-977c-4effabf4a5b9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwResource_Instance_createServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4bc7c5b2-c329-49fa-9ef3-e54e13db6d3b")
    public void setSwResource_Instance_createServices(final List<String> values) {
        this.elt.putTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_CREATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Instance_deleteServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("31d25240-f98c-42f1-a550-41cd9d36c1f3")
    public void setSwResource_Instance_deleteServices(final List<String> values) {
        this.elt.putTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_DELETESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Instance_identifierElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6f19cd1d-e8cd-478d-b85f-7cf1f4d21177")
    public void setSwResource_Instance_identifierElements(final List<String> values) {
        this.elt.putTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_IDENTIFIERELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Instance_initializeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1c4e68c2-4577-4c80-b779-4591ee5f1635")
    public void setSwResource_Instance_initializeServices(final List<String> values) {
        this.elt.putTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_INITIALIZESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwResource_Instance_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db0a96a7-a171-41b7-ba68-8c871bcdca91")
    public void setSwResource_Instance_memorySizeFootprint(final String value) {
        this.elt.putTagValue(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwResource_Instance_stateElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0cfd030d-b6f6-454b-90f2-691d83b3d1f4")
    public void setSwResource_Instance_stateElements(final List<String> values) {
        this.elt.putTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_STATEELEMENTS_TAGTYPE_ELT, values);
    }

    @objid ("23070d7b-6e1e-458b-8d01-6fd9ff065d41")
    protected SwResourceInstance(final Instance elt) {
        this.elt = elt;
    }

    @objid ("6a783fb5-c657-4d30-b369-ece6f70fd5ac")
    public static final class MdaTypes {
        @objid ("0cd95527-0d9c-49eb-8775-ad3ddbdffe2c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("97cd72ec-dcfc-47a7-8594-8339185a26fb")
        public static TagType SWRESOURCE_INSTANCE_IDENTIFIERELEMENTS_TAGTYPE_ELT;

        @objid ("e2b83112-4774-43f6-9f6c-4dd955280f5b")
        public static TagType SWRESOURCE_INSTANCE_STATEELEMENTS_TAGTYPE_ELT;

        @objid ("2cfc2376-e0b1-42b5-ab86-254e703ffd86")
        public static TagType SWRESOURCE_INSTANCE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT;

        @objid ("f7792e8a-ca1c-42bb-9439-ca65d8fc4aaf")
        public static TagType SWRESOURCE_INSTANCE_CREATESERVICES_TAGTYPE_ELT;

        @objid ("03e948ce-3045-45dc-b322-7793636a0e53")
        public static TagType SWRESOURCE_INSTANCE_DELETESERVICES_TAGTYPE_ELT;

        @objid ("b5ec2086-8acf-44d1-9c98-88b78b2b223d")
        public static TagType SWRESOURCE_INSTANCE_INITIALIZESERVICES_TAGTYPE_ELT;

        @objid ("76f87f55-5e5b-4a59-adbf-bcf77ad432a0")
        private static Stereotype MDAASSOCDEP;

        @objid ("06d765ff-74a6-42a4-9758-fcad6e6f0c62")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("50076d52-dd8b-4686-a3ba-64b94226ba40")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01a32661-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_INSTANCE_IDENTIFIERELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a32668-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_INSTANCE_STATEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a3266f-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_INSTANCE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588af-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_INSTANCE_CREATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588b6-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_INSTANCE_DELETESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588bd-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_INSTANCE_INITIALIZESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588c4-0ccf-11df-8525-001302895b2b");
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
