/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.ComputingResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << GaExecHost_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("02b19155-6bfe-466f-8160-80d8fe9b16e5")
public class GaExecHostAttribute extends ComputingResourceAttribute {
    @objid ("010d1a49-b18c-4149-a0e3-a845d010d648")
    public static final String STEREOTYPE_NAME = "GaExecHost_Attribute";

    @objid ("02f1abb2-a4e9-425f-8be2-48017931f4ac")
    public static final String GAEXECHOST_ATTRIBUTE_CLOCKOVH_TAGTYPE = "GaExecHost_Attribute_clockOvh";

    @objid ("4cc67a84-2b5f-456e-a575-baa7411a2a78")
    public static final String GAEXECHOST_ATTRIBUTE_CNTXTSWT_TAGTYPE = "GaExecHost_Attribute_cntxtSwT";

    @objid ("3d7ce06a-7cd1-44e2-9236-7b38fcf7e940")
    public static final String GAEXECHOST_ATTRIBUTE_COMMRCVOVH_TAGTYPE = "GaExecHost_Attribute_commRcvOvh";

    @objid ("396bdd7e-7e9d-4c6e-a485-2e3ca3fa1ea9")
    public static final String GAEXECHOST_ATTRIBUTE_COMMTXOVH_TAGTYPE = "GaExecHost_Attribute_commTxOvh";

    @objid ("3c4d39be-aa8f-4e66-afb6-09130d6a6d79")
    public static final String GAEXECHOST_ATTRIBUTE_HOST_TAGTYPE = "GaExecHost_Attribute_host";

    @objid ("371496f1-37e8-49c3-bab5-997cc120040c")
    public static final String GAEXECHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE = "GaExecHost_Attribute_isPreemptible";

    @objid ("4076709f-0a86-45ac-9cdd-e0c4318e1b78")
    public static final String GAEXECHOST_ATTRIBUTE_MEMSIZE_TAGTYPE = "GaExecHost_Attribute_memSize";

    @objid ("817a8339-d76b-44bd-a2f8-21c39a10e4db")
    public static final String GAEXECHOST_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE = "GaExecHost_Attribute_otherSchedPolicy";

    @objid ("0a6e8f79-f19b-440d-ae57-c4e33122d938")
    public static final String GAEXECHOST_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE = "GaExecHost_Attribute_processingUnits";

    @objid ("82c828be-3c5a-4a9a-8b0d-aae6a78645b8")
    public static final String GAEXECHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaExecHost_Attribute_protectedSharedResources";

    @objid ("ecde68bf-0fcc-44da-9a7b-6d5e41505458")
    public static final String GAEXECHOST_ATTRIBUTE_SCHEDPOLICY_TAGTYPE = "GaExecHost_Attribute_schedPolicy";

    @objid ("b3ddf93b-0c85-43be-b3e9-2ac7f23bf220")
    public static final String GAEXECHOST_ATTRIBUTE_SCHEDPRIRANGE_TAGTYPE = "GaExecHost_Attribute_schedPriRange";

    @objid ("39445c49-3ec4-4ce4-8555-caf536d89bd2")
    public static final String GAEXECHOST_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE = "GaExecHost_Attribute_schedulableResources";

    @objid ("112eb3d4-b4c8-4cec-a84b-85cb5942fcb7")
    public static final String GAEXECHOST_ATTRIBUTE_SCHEDULE_TAGTYPE = "GaExecHost_Attribute_schedule";

    @objid ("777be1a5-6731-47df-8c39-acc4b1b979c1")
    public static final String GAEXECHOST_ATTRIBUTE_THROUGHPUT_TAGTYPE = "GaExecHost_Attribute_throughput";

    @objid ("587f5036-21b6-4ad3-a6c6-0b4cd44014ab")
    public static final String GAEXECHOST_ATTRIBUTE_UTILIZATION_TAGTYPE = "GaExecHost_Attribute_utilization";

    /**
     * Tells whether a {@link GaExecHostAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << GaExecHost_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5c2a85ad-e3e7-4914-a62f-286839caaab6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << GaExecHost_Attribute >> then instantiate a {@link GaExecHostAttribute} proxy.
     * 
     * @return a {@link GaExecHostAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("2987a563-87e3-4dea-b3c0-750030a0c1f9")
    public static GaExecHostAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostAttribute.STEREOTYPE_NAME);
        return GaExecHostAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link GaExecHostAttribute} proxy from a {@link Attribute} stereotyped << GaExecHost_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link GaExecHostAttribute} proxy or <i>null</i>.
     */
    @objid ("482520c8-1ed8-4559-afac-96909a1ed675")
    public static GaExecHostAttribute instantiate(final Attribute obj) {
        return GaExecHostAttribute.canInstantiate(obj) ? new GaExecHostAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaExecHostAttribute} proxy from a {@link Attribute} stereotyped << GaExecHost_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link GaExecHostAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("523dbc91-a283-4313-a035-e39f958ebe7c")
    public static GaExecHostAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (GaExecHostAttribute.canInstantiate(obj))
        	return new GaExecHostAttribute(obj);
        else
        	throw new IllegalArgumentException("GaExecHostAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a47df6b8-b799-4560-801d-1769e2d6035d")
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
        GaExecHostAttribute other = (GaExecHostAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("d1b918ca-4ac1-4482-97c8-a2811fe03141")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e64c7bc4-dead-409d-a354-3bfdd5b3fc2e")
    public String getGaExecHost_Attribute_clockOvh() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_CLOCKOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5b2d551b-ff36-4f03-b73e-81b8b7a972de")
    public String getGaExecHost_Attribute_cntxtSwT() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_CNTXTSWT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8e57f37b-45e7-4946-87ff-64573489279e")
    public String getGaExecHost_Attribute_commRcvOvh() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_COMMRCVOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("94cf2463-426d-4334-94be-b2dca05476c0")
    public String getGaExecHost_Attribute_commTxOvh() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_COMMTXOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3d7ae6e9-619f-4d3a-8274-23a0daebf017")
    public String getGaExecHost_Attribute_host() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dba81205-a5a6-4dc6-b2ec-df5ddf76b933")
    public String getGaExecHost_Attribute_memSize() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_MEMSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4cdaf435-bd35-43d2-8849-46292b3d4b7f")
    public String getGaExecHost_Attribute_otherSchedPolicy() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Attribute_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ec796b9b-4157-478b-a55f-6cefe6d3cb8d")
    public List<String> getGaExecHost_Attribute_processingUnits() {
        return this.elt.getTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Attribute_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6421926e-1df7-40eb-995f-c7345d2ae847")
    public List<String> getGaExecHost_Attribute_protectedSharedResources() {
        return this.elt.getTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cc18de13-e162-4eec-864f-cfb7cbe31061")
    public String getGaExecHost_Attribute_schedPolicy() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("72be2dd5-ce17-4003-b401-f022c1027583")
    public String getGaExecHost_Attribute_schedPriRange() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_SCHEDPRIRANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Attribute_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("64d2f35c-3d29-44b6-bc9e-158406e8a12b")
    public List<String> getGaExecHost_Attribute_schedulableResources() {
        return this.elt.getTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f280176e-4818-4455-9de8-c6c43aa2595f")
    public String getGaExecHost_Attribute_schedule() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Attribute_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cb3f3c15-d429-4d76-8713-6058324e57b6")
    public List<String> getGaExecHost_Attribute_throughput() {
        return this.elt.getTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Attribute_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8a6ac511-4fa6-48b5-9bea-39f1282a4d54")
    public List<String> getGaExecHost_Attribute_utilization() {
        return this.elt.getTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("27eab3b0-404a-496b-8b01-2fc90fffd3d8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaExecHost_Attribute_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ab27c0ff-2134-4643-93fe-0f20e2408e30")
    public boolean isGaExecHost_Attribute_isPreemptible() {
        return this.elt.isTagged(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cc2e5262-2e8b-40ca-922c-01f3f57ffcb6")
    public void setGaExecHost_Attribute_clockOvh(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_CLOCKOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("96a7471b-88a2-4b15-9cc8-afd22ca39f7b")
    public void setGaExecHost_Attribute_cntxtSwT(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_CNTXTSWT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("70a7faf8-17a4-4f23-89b6-54eaf30dcbd2")
    public void setGaExecHost_Attribute_commRcvOvh(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_COMMRCVOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b4f38596-9b8b-4ee8-865c-83ebde6385eb")
    public void setGaExecHost_Attribute_commTxOvh(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_COMMTXOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2ee93e93-7e29-49da-9ce1-17e625d39be7")
    public void setGaExecHost_Attribute_host(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaExecHost_Attribute_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f331e2e2-f966-49d2-a580-061df6b988c7")
    public void setGaExecHost_Attribute_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8c81d9c4-56b7-4895-a320-96a8d53814db")
    public void setGaExecHost_Attribute_memSize(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_MEMSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ba1b5064-3a87-4792-9fc8-5c8e379f3d1e")
    public void setGaExecHost_Attribute_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Attribute_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f5bbb0f6-5e6f-4e3b-acde-9096bbc76de4")
    public void setGaExecHost_Attribute_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Attribute_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("23efcd90-43ad-42f1-858f-8fad0241d416")
    public void setGaExecHost_Attribute_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0bac94df-d72d-41f5-8ad3-3cadf7a89dcb")
    public void setGaExecHost_Attribute_schedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("77913e6b-29ab-41db-a4f1-badee8273008")
    public void setGaExecHost_Attribute_schedPriRange(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_SCHEDPRIRANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Attribute_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d434a162-7121-46f8-9fd2-71044cceaa6a")
    public void setGaExecHost_Attribute_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dbd64991-b8ad-403e-8507-56b7ec88ed35")
    public void setGaExecHost_Attribute_schedule(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Attribute_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c806f54a-0e70-473d-a699-6c2e379a479c")
    public void setGaExecHost_Attribute_throughput(final List<String> values) {
        this.elt.putTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Attribute_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f2f3ef7f-61e1-4098-85fe-5a7e11b1749e")
    public void setGaExecHost_Attribute_utilization(final List<String> values) {
        this.elt.putTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("b8bd99f9-40c2-4a3e-9cf7-2bd928eb1210")
    protected GaExecHostAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("72998b4a-62ba-411f-8b34-a51d21b9937b")
    public static final class MdaTypes {
        @objid ("f346e342-0bed-43ec-8c4d-65b764435f50")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b975da46-4f4c-4c4d-bab4-7efe43d18dc7")
        public static TagType GAEXECHOST_ATTRIBUTE_COMMTXOVH_TAGTYPE_ELT;

        @objid ("f8dc452d-8863-410a-bdb8-062a884fc1ed")
        public static TagType GAEXECHOST_ATTRIBUTE_COMMRCVOVH_TAGTYPE_ELT;

        @objid ("7553bde4-1ae1-4bb2-86f0-e9764ecfcb89")
        public static TagType GAEXECHOST_ATTRIBUTE_CNTXTSWT_TAGTYPE_ELT;

        @objid ("53619470-2d14-4d26-8bf6-b88b658e2f96")
        public static TagType GAEXECHOST_ATTRIBUTE_CLOCKOVH_TAGTYPE_ELT;

        @objid ("54a4a795-9db0-47f5-b2d5-75bd5397aed8")
        public static TagType GAEXECHOST_ATTRIBUTE_SCHEDPRIRANGE_TAGTYPE_ELT;

        @objid ("7a5ffb9e-f861-46a2-84c9-a4228343e892")
        public static TagType GAEXECHOST_ATTRIBUTE_MEMSIZE_TAGTYPE_ELT;

        @objid ("121871b3-e264-413e-a279-358a92673776")
        public static TagType GAEXECHOST_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT;

        @objid ("706cfd1f-8e86-4928-8199-34ed9042ba55")
        public static TagType GAEXECHOST_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT;

        @objid ("55ab9e90-1bd9-40e2-b8e2-461fe340ff21")
        public static TagType GAEXECHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("27958e2c-d49d-4884-96a4-7a2dd7ff65ca")
        public static TagType GAEXECHOST_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("cc1ee6de-f270-46a2-9802-6b06b8ec2d71")
        public static TagType GAEXECHOST_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("97b8028a-eac7-41e2-bf94-203f3fab1afd")
        public static TagType GAEXECHOST_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT;

        @objid ("5708df5b-dcbc-4811-9a37-29416a6e4ca0")
        public static TagType GAEXECHOST_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("b382d8c6-9a2e-45a7-b58b-2606376a1e4d")
        public static TagType GAEXECHOST_ATTRIBUTE_HOST_TAGTYPE_ELT;

        @objid ("d80eea83-e4cb-4f8a-9509-982f897352a4")
        public static TagType GAEXECHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("ea03e056-1746-42ef-834d-7315d928d151")
        public static TagType GAEXECHOST_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("8b2302ec-9bf3-4ca8-85bd-145f09bca663")
        private static Stereotype MDAASSOCDEP;

        @objid ("0fe41504-1a6d-4c74-ab9f-09a5bb6514ea")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("62417d78-2f4c-445f-a09c-5832bfef3024")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0360f845-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ATTRIBUTE_COMMTXOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635a97-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ATTRIBUTE_COMMRCVOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635a9e-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ATTRIBUTE_CNTXTSWT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635aa5-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ATTRIBUTE_CLOCKOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bceb-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ATTRIBUTE_SCHEDPRIRANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcf2-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ATTRIBUTE_MEMSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcf9-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bd00-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bd07-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "21cb2528-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "21cb2529-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "21cb252a-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "21cb252b-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "21cb252c-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ATTRIBUTE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "21cb252d-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "21cb252e-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "21cb252f-16ea-11df-b92a-0014222a9f79");
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
