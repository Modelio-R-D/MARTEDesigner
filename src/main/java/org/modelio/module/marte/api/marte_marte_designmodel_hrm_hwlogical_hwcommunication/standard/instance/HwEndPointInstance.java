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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.ClockResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwEndPoint_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e01b4f65-c618-4334-b6a1-98d51722383c")
public class HwEndPointInstance extends ClockResourceInstance {
    @objid ("bfdf3c4e-a5c0-4e79-8b4f-39caaadcdd2b")
    public static final String STEREOTYPE_NAME = "HwEndPoint_Instance";

    @objid ("0c0b202e-6423-4e64-a0dc-360156ad2bbc")
    public static final String HWENDPOINT_INSTANCE_CONNECTEDTO_TAGTYPE = "HwEndPoint_Instance_connectedTo";

    @objid ("b08f39bc-8fed-4e29-bd92-0a66e07781a1")
    public static final String HWENDPOINT_INSTANCE_DESCRIPTION_TAGTYPE = "HwEndPoint_Instance_description";

    @objid ("1cd9b59d-2883-44d7-be7f-fd6527db2102")
    public static final String HWENDPOINT_INSTANCE_FREQUENCY_TAGTYPE = "HwEndPoint_Instance_frequency";

    @objid ("f78504ff-f465-4c00-b898-21d7139e8e3a")
    public static final String HWENDPOINT_INSTANCE_OWNEDHW_TAGTYPE = "HwEndPoint_Instance_ownedHW";

    @objid ("e161e1dc-ce22-467d-bb11-e4e3359da954")
    public static final String HWENDPOINT_INSTANCE_P_HW_SERVICES_TAGTYPE = "HwEndPoint_Instance_p_HW_Services";

    @objid ("9ab1d924-4ac1-42f2-aade-fa41c4fda7d5")
    public static final String HWENDPOINT_INSTANCE_R_HW_SERVICES_TAGTYPE = "HwEndPoint_Instance_r_HW_Services";

    /**
     * Tells whether a {@link HwEndPointInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwEndPoint_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1928e3f9-15bf-4dd5-a0fd-35e6cd1fc603")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwEndPoint_Instance >> then instantiate a {@link HwEndPointInstance} proxy.
     * 
     * @return a {@link HwEndPointInstance} proxy on the created {@link Instance}.
     */
    @objid ("6573d151-20f7-40ad-a6da-342c689fe52a")
    public static HwEndPointInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointInstance.STEREOTYPE_NAME);
        return HwEndPointInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwEndPointInstance} proxy from a {@link Instance} stereotyped << HwEndPoint_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwEndPointInstance} proxy or <i>null</i>.
     */
    @objid ("6ba2b68e-e45f-4d85-bf0f-020189c73ebe")
    public static HwEndPointInstance instantiate(final Instance obj) {
        return HwEndPointInstance.canInstantiate(obj) ? new HwEndPointInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwEndPointInstance} proxy from a {@link Instance} stereotyped << HwEndPoint_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwEndPointInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2e60444f-a84f-4fce-8cab-62bb60341b82")
    public static HwEndPointInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwEndPointInstance.canInstantiate(obj))
        	return new HwEndPointInstance(obj);
        else
        	throw new IllegalArgumentException("HwEndPointInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c31917e3-af9a-43ae-a2d3-a4bfb6c205d1")
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
        HwEndPointInstance other = (HwEndPointInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("26e976f8-f7aa-4a8f-a2f7-d12247336796")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Instance_connectedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("aec511f0-2957-4a77-ba16-c7e1bb18ad25")
    public List<String> getHwEndPoint_Instance_connectedTo() {
        return this.elt.getTagValues(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_CONNECTEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("35adca23-1e23-4f32-96c8-e30f4387786a")
    public String getHwEndPoint_Instance_description() {
        return this.elt.getTagValue(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3c962409-c2eb-40cd-82c7-1bd00a60e1e8")
    public String getHwEndPoint_Instance_frequency() {
        return this.elt.getTagValue(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Instance_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e08e51c0-d890-47b8-812c-96cd50bedd36")
    public List<String> getHwEndPoint_Instance_ownedHW() {
        return this.elt.getTagValues(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Instance_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2a49144b-634b-4488-a916-317cbf22b13f")
    public List<String> getHwEndPoint_Instance_p_HW_Services() {
        return this.elt.getTagValues(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Instance_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("63f244c8-39fc-4e9f-b965-2123100d6c9b")
    public List<String> getHwEndPoint_Instance_r_HW_Services() {
        return this.elt.getTagValues(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("c5002ee4-be3c-4b18-879c-e121ed0413fc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Instance_connectedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bccef060-1232-4215-a734-ab6da9b5e0e6")
    public void setHwEndPoint_Instance_connectedTo(final List<String> values) {
        this.elt.putTagValues(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_CONNECTEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwEndPoint_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8e399002-4b80-4c36-962d-7b69fc2c214b")
    public void setHwEndPoint_Instance_description(final String value) {
        this.elt.putTagValue(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwEndPoint_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("08f5ce77-9867-4fe5-9e44-02ecf39013b9")
    public void setHwEndPoint_Instance_frequency(final String value) {
        this.elt.putTagValue(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Instance_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("38b7170f-3844-4b21-a838-cbca0b1fc8ec")
    public void setHwEndPoint_Instance_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Instance_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("95fc176a-32a3-49d9-94ce-511a4766fb36")
    public void setHwEndPoint_Instance_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Instance_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("75d3719a-b274-4295-92c1-b9d3da9fb978")
    public void setHwEndPoint_Instance_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("e4485ced-90e1-4a1a-9e04-400dcd320a4b")
    protected HwEndPointInstance(final Instance elt) {
        super(elt);
    }

    @objid ("22e3a638-c9b4-409c-839b-f3f730e3f372")
    public static final class MdaTypes {
        @objid ("273e24d2-4ced-4266-9a98-82740428e123")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("32c80523-d242-40dd-9da7-b956336c1050")
        public static TagType HWENDPOINT_INSTANCE_CONNECTEDTO_TAGTYPE_ELT;

        @objid ("304b9349-d29c-4675-b7bf-9ba3eeae1227")
        public static TagType HWENDPOINT_INSTANCE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("942f11a6-c5dd-4e09-8595-4998ced3bee9")
        public static TagType HWENDPOINT_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("111402a4-862b-4097-922a-92340d9c9e0a")
        public static TagType HWENDPOINT_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("e29cf973-b3b6-45cd-9c11-0251ad61fc23")
        public static TagType HWENDPOINT_INSTANCE_OWNEDHW_TAGTYPE_ELT;

        @objid ("a86626ca-184c-431d-884f-0dd59dd8551e")
        public static TagType HWENDPOINT_INSTANCE_FREQUENCY_TAGTYPE_ELT;

        @objid ("ad37c8a9-4803-49f4-9dba-09420b866279")
        private static Stereotype MDAASSOCDEP;

        @objid ("b6606323-8183-4156-94c7-3c910ddaf207")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8d3492b6-2bcd-4c91-b7f1-92a043cc1a54")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "010cf433-0ccf-11df-8525-001302895b2b");
            HWENDPOINT_INSTANCE_CONNECTEDTO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e7758faa-1726-11df-b92a-0014222a9f79");
            HWENDPOINT_INSTANCE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4c94f0be-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4c94f0bf-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4c94f0c0-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_INSTANCE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4c94f0c1-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_INSTANCE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4c94f0c2-92a9-11e0-a69d-0027103f347c");
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
