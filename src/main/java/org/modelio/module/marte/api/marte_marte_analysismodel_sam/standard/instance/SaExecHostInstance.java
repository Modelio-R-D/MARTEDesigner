/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.instance.GaExecHostInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << SaExecHost_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9e1b4b23-2229-4f0c-b6d8-d0daa420d0f3")
public class SaExecHostInstance extends GaExecHostInstance {
    @objid ("d087cb3e-5820-4a88-84f8-185d9250741a")
    public static final String STEREOTYPE_NAME = "SaExecHost_Instance";

    @objid ("41277e7a-327d-48b0-bb8b-b5fb7eef71eb")
    public static final String SAEXECHOST_INSTANCE_ISRPRIORANGE_TAGTYPE = "SaExecHost_Instance_ISRprioRange";

    @objid ("65af1b95-d91b-4b1e-b850-1f9bc3348006")
    public static final String SAEXECHOST_INSTANCE_ISRSWITCHT_TAGTYPE = "SaExecHost_Instance_ISRswitchT";

    @objid ("fcfe73b6-fe59-4785-9820-18bf2b2a5b28")
    public static final String SAEXECHOST_INSTANCE_ISSCHED_TAGTYPE = "SaExecHost_Instance_isSched";

    @objid ("b8d9d96e-d77d-406e-8c2b-7a449a9d82fb")
    public static final String SAEXECHOST_INSTANCE_SCHSLACK_TAGTYPE = "SaExecHost_Instance_schSlack";

    @objid ("01fc77ce-a5c9-4578-a9d4-8c30f5cc419b")
    public static final String SAEXECHOST_INSTANCE_SCHEDUTILIZ_TAGTYPE = "SaExecHost_Instance_schedUtiliz";

    /**
     * Tells whether a {@link SaExecHostInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SaExecHost_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f79f8204-a2c5-4e8f-a49f-dfcd661cbf54")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SaExecHost_Instance >> then instantiate a {@link SaExecHostInstance} proxy.
     * 
     * @return a {@link SaExecHostInstance} proxy on the created {@link Instance}.
     */
    @objid ("2d208897-e19c-4637-a16b-51afe596fdcf")
    public static SaExecHostInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostInstance.STEREOTYPE_NAME);
        return SaExecHostInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SaExecHostInstance} proxy from a {@link Instance} stereotyped << SaExecHost_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SaExecHostInstance} proxy or <i>null</i>.
     */
    @objid ("cd068399-5a22-4943-889f-1f4812cc4a9a")
    public static SaExecHostInstance instantiate(final Instance obj) {
        return SaExecHostInstance.canInstantiate(obj) ? new SaExecHostInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaExecHostInstance} proxy from a {@link Instance} stereotyped << SaExecHost_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SaExecHostInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fc63dc16-9f87-4520-b011-b75064128fa2")
    public static SaExecHostInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SaExecHostInstance.canInstantiate(obj))
        	return new SaExecHostInstance(obj);
        else
        	throw new IllegalArgumentException("SaExecHostInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("321250c5-a7ed-438e-b591-7ec99037829b")
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
        SaExecHostInstance other = (SaExecHostInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("92327e27-976f-4ff8-86de-e08e6f0e510a")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'SaExecHost_Instance_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5045c70d-d8e4-4bdc-829e-df06a2c94081")
    public String getSaExecHost_Instance_ISRprioRange() {
        return this.elt.getTagValue(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_ISRPRIORANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Instance_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fa1d46d8-8a90-4cf4-a8fe-4baac90ec5cf")
    public String getSaExecHost_Instance_ISRswitchT() {
        return this.elt.getTagValue(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_ISRSWITCHT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Instance_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4e2cd708-68a0-48e2-89aa-4b9eed4f0fd8")
    public String getSaExecHost_Instance_schSlack() {
        return this.elt.getTagValue(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Instance_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8c7fc333-93eb-4f99-9760-02970937b77c")
    public String getSaExecHost_Instance_schedUtiliz() {
        return this.elt.getTagValue(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_SCHEDUTILIZ_TAGTYPE_ELT);
    }

    @objid ("2eb2d3c8-baf3-4fc2-a27b-facdc5f5b72f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaExecHost_Instance_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1b1ee760-fd00-4113-8a02-d1b3abdf3f43")
    public boolean isSaExecHost_Instance_isSched() {
        return this.elt.isTagged(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Instance_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e2515dc4-c90f-493c-b3e7-eafddda72ae7")
    public void setSaExecHost_Instance_ISRprioRange(final String value) {
        this.elt.putTagValue(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_ISRPRIORANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Instance_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60ac2985-b34a-4939-a4df-d8af11eea535")
    public void setSaExecHost_Instance_ISRswitchT(final String value) {
        this.elt.putTagValue(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_ISRSWITCHT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaExecHost_Instance_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("49d67eb2-525a-4dfc-bd0d-098f90ad24e4")
    public void setSaExecHost_Instance_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Instance_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3603349b-da41-49b2-bc3f-d14e643d0290")
    public void setSaExecHost_Instance_schSlack(final String value) {
        this.elt.putTagValue(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Instance_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1a424840-6161-4663-94c6-8db031c2769f")
    public void setSaExecHost_Instance_schedUtiliz(final String value) {
        this.elt.putTagValue(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_SCHEDUTILIZ_TAGTYPE_ELT, value);
    }

    @objid ("603406e1-867c-4be3-88b6-a39b2b9e9ace")
    protected SaExecHostInstance(final Instance elt) {
        super(elt);
    }

    @objid ("47608e91-69b9-45a5-a7f1-6e0b2f4752ab")
    public static final class MdaTypes {
        @objid ("c2001df6-0e08-43f8-9239-395ae034b257")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1ef5d5f1-1d56-48d9-a222-84c196814b44")
        public static TagType SAEXECHOST_INSTANCE_ISSCHED_TAGTYPE_ELT;

        @objid ("d7631316-4c39-4b32-bb38-e4036ba98e3f")
        public static TagType SAEXECHOST_INSTANCE_SCHSLACK_TAGTYPE_ELT;

        @objid ("87b818b9-e702-4c0c-a4db-25d8ca06c410")
        public static TagType SAEXECHOST_INSTANCE_SCHEDUTILIZ_TAGTYPE_ELT;

        @objid ("97f503a8-9dbf-4dac-acbc-7340f2a0dc73")
        public static TagType SAEXECHOST_INSTANCE_ISRSWITCHT_TAGTYPE_ELT;

        @objid ("03ea041f-e1ec-4315-b05b-5b65bb233de9")
        public static TagType SAEXECHOST_INSTANCE_ISRPRIORANGE_TAGTYPE_ELT;

        @objid ("132f761d-8a64-43ed-a306-c38197e89d84")
        private static Stereotype MDAASSOCDEP;

        @objid ("b5ff9d3d-b122-41c3-bfe0-0c9cff67932c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("63778c3f-7a8a-4555-8349-da56825a8962")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03a156ee-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_INSTANCE_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b940-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_INSTANCE_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b947-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_INSTANCE_SCHEDUTILIZ_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b94e-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_INSTANCE_ISRSWITCHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b955-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_INSTANCE_ISRPRIORANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b95c-0ccf-11df-8525-001302895b2b");
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
