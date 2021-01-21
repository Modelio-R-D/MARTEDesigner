/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << RtUnit_Class >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2ef2b105-1749-4784-bbdf-b424626ac2d2")
public class RtUnitClass {
    @objid ("ab5bdade-2387-463c-ab2f-f9c49b3e0331")
    public static final String STEREOTYPE_NAME = "RtUnit_Class";

    @objid ("ea0435bf-d5ee-4b91-9082-42024fdfa138")
    public static final String RTUNIT_CLASS_ISDYNAMIC_TAGTYPE = "RtUnit_Class_isDynamic";

    @objid ("cf501af4-da11-48a0-8aba-f709bc698201")
    public static final String RTUNIT_CLASS_ISMAIN_TAGTYPE = "RtUnit_Class_isMain";

    @objid ("e1d0cf98-ddcf-4c56-842b-559d8975ce97")
    public static final String RTUNIT_CLASS_MAIN_TAGTYPE = "RtUnit_Class_main";

    @objid ("ace56631-f9f7-497e-8b0c-1fea134bbe4e")
    public static final String RTUNIT_CLASS_MEMORYSIZE_TAGTYPE = "RtUnit_Class_memorySize";

    @objid ("c5e8941f-04cf-4ee3-a676-6da0dc1b5b55")
    public static final String RTUNIT_CLASS_MSGMAXSIZE_TAGTYPE = "RtUnit_Class_msgMaxSize";

    @objid ("42b3ce43-0d6b-4e03-b80e-a414ccd1e16e")
    public static final String RTUNIT_CLASS_OPERATIONALMODE_TAGTYPE = "RtUnit_Class_operationalMode";

    @objid ("bece63a1-3788-4f6e-98bd-8c00d3be776a")
    public static final String RTUNIT_CLASS_QUEUESCHEDPOLICY_TAGTYPE = "RtUnit_Class_queueSchedPolicy";

    @objid ("b3024345-1758-4d66-96db-4648bcb08bad")
    public static final String RTUNIT_CLASS_QUEUESIZE_TAGTYPE = "RtUnit_Class_queueSize";

    @objid ("dc6314a8-ac54-4b64-86c9-add9a60302df")
    public static final String RTUNIT_CLASS_SRPOOLPOLICY_TAGTYPE = "RtUnit_Class_srPoolPolicy";

    @objid ("9c3f2417-85c5-483a-884b-40a9d87e1f43")
    public static final String RTUNIT_CLASS_SRPOOLSIZE_TAGTYPE = "RtUnit_Class_srPoolSize";

    @objid ("ee79f9a2-b7f8-4c23-b800-be81613a3044")
    public static final String RTUNIT_CLASS_SRPOOLWAITINGTIME_TAGTYPE = "RtUnit_Class_srPoolWaitingTime";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("8b7eaaff-e0af-42db-9d46-b4e60f18a5cf")
    protected final Class elt;

    /**
     * Tells whether a {@link RtUnitClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RtUnit_Class >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5d8de49e-9769-4ea6-9b88-b1ddec1f2d51")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RtUnit_Class >> then instantiate a {@link RtUnitClass} proxy.
     * 
     * @return a {@link RtUnitClass} proxy on the created {@link Class}.
     */
    @objid ("d193ebe2-920c-4c5f-889b-d42fc46fe814")
    public static RtUnitClass create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Class");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitClass.STEREOTYPE_NAME);
        return RtUnitClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RtUnitClass} proxy from a {@link Class} stereotyped << RtUnit_Class >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RtUnitClass} proxy or <i>null</i>.
     */
    @objid ("867ba54c-bf66-456c-b2d4-b09669c72436")
    public static RtUnitClass instantiate(final Class obj) {
        return RtUnitClass.canInstantiate(obj) ? new RtUnitClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtUnitClass} proxy from a {@link Class} stereotyped << RtUnit_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RtUnitClass} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("84f1232a-96da-41ea-ba7b-5f1001dc322d")
    public static RtUnitClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RtUnitClass.canInstantiate(obj))
        	return new RtUnitClass(obj);
        else
        	throw new IllegalArgumentException("RtUnitClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("aa0b7343-1bcc-464b-814d-b7289535b0fb")
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
        RtUnitClass other = (RtUnitClass) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("d9617ba0-b11a-470a-9af3-8972725c4913")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtUnit_Class_main'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1647231f-d256-4b73-8a75-6800d033bdd6")
    public String getRtUnit_Class_main() {
        return this.elt.getTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_MAIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Class_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0cdf33aa-834d-43b8-95e0-b3f06c47373f")
    public String getRtUnit_Class_memorySize() {
        return this.elt.getTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Class_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fc3c8084-8582-4db2-9400-050668ab644b")
    public String getRtUnit_Class_msgMaxSize() {
        return this.elt.getTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_MSGMAXSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Class_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4ea1c725-3da9-4e50-8051-4cba5e0abe1c")
    public String getRtUnit_Class_operationalMode() {
        return this.elt.getTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_OPERATIONALMODE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Class_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ee292d62-ae16-4230-9a05-0aa3be05e426")
    public String getRtUnit_Class_queueSchedPolicy() {
        return this.elt.getTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_QUEUESCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Class_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6f84c508-7b22-4ebc-acfb-04822ddb33e6")
    public String getRtUnit_Class_queueSize() {
        return this.elt.getTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_QUEUESIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Class_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a0c1f141-7b32-4359-a916-0c5bccaaff79")
    public String getRtUnit_Class_srPoolPolicy() {
        return this.elt.getTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_SRPOOLPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Class_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ec41ace6-1270-46f6-9407-9d941b897676")
    public String getRtUnit_Class_srPoolSize() {
        return this.elt.getTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_SRPOOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Class_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bff3f899-f1da-49d5-b465-3391c46def79")
    public String getRtUnit_Class_srPoolWaitingTime() {
        return this.elt.getTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_SRPOOLWAITINGTIME_TAGTYPE_ELT);
    }

    @objid ("473e74a9-72da-43ef-964e-af229143991e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtUnit_Class_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("385f0887-b17a-448f-8dc0-c827ce501926")
    public boolean isRtUnit_Class_isDynamic() {
        return this.elt.isTagged(RtUnitClass.MdaTypes.RTUNIT_CLASS_ISDYNAMIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'RtUnit_Class_isMain'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9620d8b6-5b57-414e-bebf-202144ea6389")
    public boolean isRtUnit_Class_isMain() {
        return this.elt.isTagged(RtUnitClass.MdaTypes.RTUNIT_CLASS_ISMAIN_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtUnit_Class_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ca6bda0e-bb41-4591-89c7-c74cf4c3373c")
    public void setRtUnit_Class_isDynamic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_ISDYNAMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtUnitClass.MdaTypes.RTUNIT_CLASS_ISDYNAMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtUnit_Class_isMain'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("58b84a7b-66a2-49e1-9bfd-bb4e6db1f774")
    public void setRtUnit_Class_isMain(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_ISMAIN_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtUnitClass.MdaTypes.RTUNIT_CLASS_ISMAIN_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'RtUnit_Class_main'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("867cd79c-0599-4d85-804c-7036e6c87248")
    public void setRtUnit_Class_main(final String value) {
        this.elt.putTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_MAIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Class_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d6d16d46-f114-4237-b5e1-d3b2fb660de3")
    public void setRtUnit_Class_memorySize(final String value) {
        this.elt.putTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Class_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("63195bd0-721b-4f66-a123-85a0c8940d90")
    public void setRtUnit_Class_msgMaxSize(final String value) {
        this.elt.putTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_MSGMAXSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Class_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ba27cff7-3066-434b-912d-deb20ca62544")
    public void setRtUnit_Class_operationalMode(final String value) {
        this.elt.putTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_OPERATIONALMODE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Class_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f01a2a1d-576d-42c1-a7cd-59af0863b557")
    public void setRtUnit_Class_queueSchedPolicy(final String value) {
        this.elt.putTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_QUEUESCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Class_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0698cf9f-35ab-47ee-83d7-d54786019c12")
    public void setRtUnit_Class_queueSize(final String value) {
        this.elt.putTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_QUEUESIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Class_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b85ae4f3-b464-4963-a600-11b6d35bb9d3")
    public void setRtUnit_Class_srPoolPolicy(final String value) {
        this.elt.putTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_SRPOOLPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Class_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("34e777fe-815f-4a8c-99c9-2728d05ba9e1")
    public void setRtUnit_Class_srPoolSize(final String value) {
        this.elt.putTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_SRPOOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Class_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3b4dbc0f-7ac3-48d3-8a34-aa2c52c1c073")
    public void setRtUnit_Class_srPoolWaitingTime(final String value) {
        this.elt.putTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_SRPOOLWAITINGTIME_TAGTYPE_ELT, value);
    }

    @objid ("f7730d0e-a570-47e8-ac52-e1c7a16fa542")
    protected RtUnitClass(final Class elt) {
        this.elt = elt;
    }

    @objid ("5263a247-d0b3-4d11-9164-9428a92db097")
    public static final class MdaTypes {
        @objid ("441d2982-2c2a-4dc0-8398-9445b15b0dcd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("16447139-1110-4849-a0d6-21b05f71c92e")
        public static TagType RTUNIT_CLASS_ISDYNAMIC_TAGTYPE_ELT;

        @objid ("45d67f21-356e-4b2b-9a20-4371f6a0fd66")
        public static TagType RTUNIT_CLASS_ISMAIN_TAGTYPE_ELT;

        @objid ("6ccdfe51-1840-4f68-938a-892c3203bcb3")
        public static TagType RTUNIT_CLASS_SRPOOLSIZE_TAGTYPE_ELT;

        @objid ("54b89cc7-3c41-4729-a639-498b4f07b97d")
        public static TagType RTUNIT_CLASS_SRPOOLPOLICY_TAGTYPE_ELT;

        @objid ("3a362cc0-cd31-42b7-89d5-2956b605bac7")
        public static TagType RTUNIT_CLASS_SRPOOLWAITINGTIME_TAGTYPE_ELT;

        @objid ("0db4da7f-bdf2-4f9d-9ad6-717c7f6e29b5")
        public static TagType RTUNIT_CLASS_QUEUESCHEDPOLICY_TAGTYPE_ELT;

        @objid ("663741be-a970-4d4e-b0c2-f3a42b91bf42")
        public static TagType RTUNIT_CLASS_QUEUESIZE_TAGTYPE_ELT;

        @objid ("4b03c00d-cd5a-472d-95a6-b68b2edde85e")
        public static TagType RTUNIT_CLASS_MSGMAXSIZE_TAGTYPE_ELT;

        @objid ("beb8a161-f4a0-44dc-858e-626678dd35bf")
        public static TagType RTUNIT_CLASS_OPERATIONALMODE_TAGTYPE_ELT;

        @objid ("f4ee118a-168e-4ad5-8c34-526c947b3f30")
        public static TagType RTUNIT_CLASS_MAIN_TAGTYPE_ELT;

        @objid ("faaa35c2-007f-4fe9-a6dc-63d6d866a413")
        public static TagType RTUNIT_CLASS_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("ef128560-bf5d-4f30-a089-cfea702c11c0")
        private static Stereotype MDAASSOCDEP;

        @objid ("9a5488bf-2d4b-4490-a03c-a6263a731c3e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2bb89aea-bdb8-45b3-b65a-ed311d670c0f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4cd42cdf-0ce9-11df-b742-001302895b2b");
            RTUNIT_CLASS_ISDYNAMIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4cd42ce0-0ce9-11df-b742-001302895b2b");
            RTUNIT_CLASS_ISMAIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4cd42ce1-0ce9-11df-b742-001302895b2b");
            RTUNIT_CLASS_SRPOOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4cd42ce2-0ce9-11df-b742-001302895b2b");
            RTUNIT_CLASS_SRPOOLPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4cd42ce3-0ce9-11df-b742-001302895b2b");
            RTUNIT_CLASS_SRPOOLWAITINGTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4cd42ce4-0ce9-11df-b742-001302895b2b");
            RTUNIT_CLASS_QUEUESCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9c08435f-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_CLASS_QUEUESIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9c08435d-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_CLASS_MSGMAXSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9c08435e-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_CLASS_OPERATIONALMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4cd42ce5-0ce9-11df-b742-001302895b2b");
            RTUNIT_CLASS_MAIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4cd42ce6-0ce9-11df-b742-001302895b2b");
            RTUNIT_CLASS_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4cd42ce7-0ce9-11df-b742-001302895b2b");
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
